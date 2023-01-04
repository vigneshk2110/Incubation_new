package HospitalOPD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterOrLogin")
public class RegisterOrLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			String dbName = "userDetails";
			String query = "CREATE DATABASE IF NOT EXISTS " + dbName;
			st.execute(query);
			query = "use " + dbName;
			st.execute(query);
			query = "CREATE TABLE IF NOT EXISTS infoTable(" + "patientID int primary key AUTO_INCREMENT,"
					+ "Patient_Name varchar(25), " + "Patient_Phone bigint(25), " + "in_Time varchar(25),"
					+ "Treatment_Time int," + "Out_Time varchar(10)," + "Total_Waiting_Time varchar(10),"
					+ "Message varchar(10))";
			st.execute(query);
			url = url + "/" + dbName;
			con = DriverManager.getConnection(url, user, password);
			String pName = request.getParameter("uName");
			String mobile = request.getParameter("phone");
			long phone = Long.parseLong(mobile);
			query = "select * from infoTable where Patient_Name = '" + pName + "' AND Patient_Phone = " + phone;
			ResultSet rs = st.executeQuery(query);
			PrintWriter out = response.getWriter();

			if (rs.next()) {
				login(pName, phone, con, st); // Login Process
				out.println("Login Successful");
			} else {
				register(pName, phone, con, st); // Registration Process
				out.println("Registration Successful");
			}
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void register(String pName, long phone, Connection con, Statement st)
			throws SQLException, ClassNotFoundException {
		String query1 = "INSERT INTO infoTable(Patient_Name,Patient_Phone,in_Time,Treatment_Time,Out_Time,Total_Waiting_Time,Message) "
				+ "VALUES('" + pName + "'," + phone + ",'null',0,'null','null','null')";
		st.executeUpdate(query1);
		String inTime = getTime(); // in-time
		int treatMentTime = (int) (Math.random() * 19 + 2); // 2-20 - TreatmentTime
		String outTime = processTime(inTime, treatMentTime); // time+waiting time+15
		String waitingTime = findWaitingTime(outTime, inTime, treatMentTime);
		String message = messageDisplay(waitingTime);
		insertData(pName, phone, inTime, treatMentTime, outTime, waitingTime, message, con, st);
	}

	static void login(String name, long phoneNum, Connection con, Statement st)
			throws SQLException, ClassNotFoundException {
		String inTime = getTime(); // in-time
		int treatMentTime = (int) (Math.random() * 19 + 2); // 2-20 - TreatmentTime
		String outTime = processTime(inTime, treatMentTime); // time+waiting time+15
		String waitingTime = findWaitingTime(outTime, inTime, treatMentTime);
		String message = messageDisplay(waitingTime);
		insertData(name, phoneNum, inTime, treatMentTime, outTime, waitingTime, message, con, st);
	}

	static String getTime() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt = LocalTime.now();
		String time = df.format(lt);
		return time;
	}

	static String processTime(String time, int waitingTime) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt = LocalTime.parse(time);
		int random = (int) (Math.random() * 11);
		return df.format(lt.plusMinutes(random + waitingTime + 15));
	}

	private static String findWaitingTime(String outTime, String inTime, int treatMentTime) {
		LocalTime in = LocalTime.parse(inTime);
		LocalTime out = LocalTime.parse(outTime);
		String result = String.valueOf((in.until(out, ChronoUnit.MINUTES) - treatMentTime - 15) + " Mins");
		return result;
	}

	private static String messageDisplay(String waitingTime) {
		StringBuilder message = new StringBuilder(waitingTime);
		message = message.replace(message.length() - 5, message.length(), "");
		int num = Integer.parseInt(message.toString());
		if (num > 0) {
			return "Sorry!!!";
		}
		return "Thank You!!!";
	}

	static void insertData(String name, long phoneNum, String inTime, int treatMentTime, String outTime,
			String waitingTime, String message, Connection con, Statement st)
			throws SQLException, ClassNotFoundException {
		st.execute("update infoTable set in_Time='" + inTime + "'," + "Treatment_Time=" + treatMentTime + ","
				+ "Out_Time='" + outTime + "'," + "Total_Waiting_Time='" + waitingTime + "', " + "Message='" + message
				+ "'" + "where Patient_Phone =" + phoneNum);
	}
}
