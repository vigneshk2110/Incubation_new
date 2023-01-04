package hospitalOPD;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Register extends OPDCaller {

	static void initialOperation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Patient Name");
		String name = sc.nextLine();
		System.out.println("Enter the Patient's Contact");
		long phoneNum = sc.nextLong();
		String query = "select * from register where patientName = '"+name+"' AND patientMobile = "+ phoneNum;
		try {
			execute(query,name,phoneNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

	static void execute(String query, String name, long phoneNum) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");      // Loading & registering the driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root","root");  // connection Object creation
		Statement st = con.createStatement();
		createTable();
		ResultSet rSet =st.executeQuery(query);
		if (rSet.next()) {
			login(query,name,phoneNum);}
		else {
			String query1 = "INSERT INTO register(patientName,patientMobile,in_time,TreatmentTime,outTime,TotalWaitingTime) "
					+ "VALUES('" + name + "'," +phoneNum+",'null',0,'null','null')";
			st.executeUpdate(query1);
			String inTime = getTime(); // in-time
			int treatMentTime = (int)(Math.random() * 19 + 2); // 2-20 - TreatmentTime
			String outTime = processTime(inTime, treatMentTime); // time+waiting time+15
			String waitingTime = findWaitingTime(outTime,inTime, treatMentTime);
			String message = messageDisplay(waitingTime);
			insertData(name, phoneNum, inTime, treatMentTime,outTime, waitingTime,message);
		}

		st.close();
		con.close();

	}

	private static String messageDisplay(String waitingTime) {

		StringBuilder message = new StringBuilder(waitingTime);
		message =message.replace(message.length()-5, message.length(), "");
		
		int num = Integer.parseInt(message.toString());

		if (num>0) {
			return "Sorry!!!";
		}

		return "Thank You!!!";
	}

	static void login(String query, String name, long phoneNum) throws SQLException, ClassNotFoundException {
		String inTime = getTime(); // in-time
		int treatMentTime = (int)(Math.random() * 19 + 2); // 2-20 - TreatmentTime
		String outTime = processTime(inTime, treatMentTime); // time+waiting time+15
		String waitingTime = findWaitingTime(outTime,inTime, treatMentTime);
		String message = messageDisplay(waitingTime);
		insertData(name, phoneNum, inTime, treatMentTime,outTime, waitingTime,message);
	}


	private static String findWaitingTime(String outTime, String inTime, int treatMentTime) {
		LocalTime in = LocalTime.parse(inTime);
		LocalTime out = LocalTime.parse(outTime);
		String result = String.valueOf((in.until(out,ChronoUnit.MINUTES)-treatMentTime-15) + " Mins");
		return result;
	}

	static void insertData(String name, long phoneNum, String inTime, int treatMentTime, String outTime, String waitingTime, String message)throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");      // Loading & registering the driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root","root"); // connection Object creation
		Statement st = con.createStatement();
		st.execute("update register set in_time='"+inTime+"',"
				+ "TreatmentTime="+treatMentTime+","
				+ "outTime='"+outTime+"',"
				+ "TotalWaitingTime='"+waitingTime+"', "
				+ "Message='"+message+"'"
				+ "where patientMobile ="+phoneNum);


		st.close();
		con.close();
	}

	static String processTime(String time, int waitingTime) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt = LocalTime.parse(time);
		int random = (int)(Math.random() * 11 );
		return df.format(lt.plusMinutes(random + waitingTime + 15));
	}

	static String getTime() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt = LocalTime.now();
		String time=df.format(lt);
		return time;
	}

	static void createTable() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		st.execute("CREATE TABLE IF NOT EXISTS register("
				+ "patientID int primary key AUTO_INCREMENT,"
				+ "patientName varchar(30) not null,"
				+ "patientMobile bigint(10) not null,"
				+ "in_time varchar(10) , "
				+ "TreatmentTime int, "
				+ "outTime varchar(10), "
				+ "TotalWaitingTime varchar(10),"
				+ "Message varchar(10))");
		st.close();
		con.close();
	}

	public static void display()throws SQLException, ClassNotFoundException {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from register");

		System.out.println("----------------------------------------------------------------");
		System.out.println("Name		in-Time		out-Time	Treatment-time		waiting-Time		message");


		while (rs.next()) {
			String name = rs.getString(2);
			String inTime = rs.getString(4);
			int TreatmentTime = rs.getInt(5);
			String outTime = rs.getString(6);
			String waitingTime = rs.getString(7);
			String message = rs.getString(8);


			System.out.println(name+"    "+inTime+" 	    "+outTime+" 	    "+TreatmentTime+ " 	    "+waitingTime+ "   "+message );

		}
		System.out.println("----------------------------------------------------------------");
		st.close();
		con.close();
		}
		catch (Exception e) {
			System.out.println("No Table Exist");
			e.printStackTrace();
		}
		
	}
}
