package OPD;

import java.sql.*;
public class DB {
	static void register(String pat_name,String pat_inTime) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st = con.createStatement();
		String query="insert into userdetail(patient_name,in_time) values ('"+pat_name+"','"+pat_inTime+"') ";
		st.executeUpdate(query);
		st.close();
		con.close();
		
	}
	static void update(int pat_id,String pat_inTime) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		String sql ="update userdetail set in_time='"+pat_inTime+"' where patient_id="+pat_id+"";
		PreparedStatement st = con.prepareStatement(sql);
		st.executeUpdate();
		st.close();
		con.close();
		
	}
	static boolean verify(int pat_id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select patient_id from userdetail where patient_id="+pat_id+" ");
		if(!rs.next()) {
			return false;
		}
		st.close();
		con.close();
		
		return true;
	}
	static String userinfo(int pat_id) throws Exception {
		String name="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userdetail where patient_id="+pat_id+"");
		rs.next();
		name=rs.getString(2);
		st.close();
		con.close();
		
		return name;
	}
	static void createDb() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE DATABASE IF NOT EXISTS hospital");
		st.close();
		con.close();
		
	}
	static void createTable() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE TABLE IF NOT EXISTS userdetail(patient_id int primary key AUTO_INCREMENT,patient_name varchar(30) not null,in_time varchar(10) not null)");
		st.close();
		con.close();
		
	}
	static void createTable2() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE TABLE IF NOT EXISTS patientEntry(patient_id int primary key ,TimeTakenDoctor varchar(10) not null,out_time varchar(10) not null,Wait_time varchar(10) not null)");
		st.close();
		con.close();
		
	}

	static void update2(int pat_id,String random,String outtime,int timeTaken) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		String sql ="update patiententry set out_time='"+outtime+"',TimeTakenDoctor='"+random+"',wait_time="+timeTaken+" where patient_id="+pat_id+"";
		PreparedStatement st = con.prepareStatement(sql);
		st.executeUpdate();
		st.close();
		con.close();
		
	}
	static boolean verify2(int pat_id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select patient_id from patiententry where patient_id="+pat_id+" ");
		if(!rs.next()) {
			return false;
		}
		st.close();
		con.close();
		
		return true;
	}
	static void register2(int pat_id,String random,String outTime,int timeTaken) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st = con.createStatement();
		String query="insert into patiententry values("+pat_id+",'"+random+"','"+outTime+"',"+timeTaken+") ";
		st.executeUpdate(query);
		st.close();
		con.close();
	}
	static void display() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st = con.createStatement();
		String query="select * from patiententry";
		ResultSet rs=st.executeQuery(query);
		System.out.println("---------------------------------------------");
		System.out.println("patient_id  timeTaken  out_time   waiting_time");
		while(rs.next()) {
			int id=rs.getInt(1);
			String ttD=rs.getString(2);
			String ot=rs.getString(3);
			int wt=rs.getInt(4);
			System.out.println("   "+id+"          "+ttD+"     "+ot+"            "+wt);
		} 
		System.out.println("---------------------------------------------");
		HospitalMain.mainFunction();
		st.close();
		con.close();
		
	}
	static void display(int pid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st = con.createStatement();
		String query="select * from patiententry where patient_id="+pid+" ";
		ResultSet rs=st.executeQuery(query);
		System.out.println("---------------------------------------------");
		System.out.println("patient_id  timeTaken  out_time   waiting_time");
		rs.next();
			int id=rs.getInt(1);
			String ttD=rs.getString(2);
			String ot=rs.getString(3);
			int wt=rs.getInt(4);
			System.out.println("   "+id+"          "+ttD+"     "+ot+"            "+wt);
		System.out.println("---------------------------------------------");
		st.close();
		con.close();
		
	}
	static void display1(int pid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st = con.createStatement();
		String query="select * from userdetail where patient_id="+pid+" ";
		ResultSet rs=st.executeQuery(query);
		System.out.println("---------------------------------------------");
		System.out.println("patient_id  name  in_time");
		rs.next();
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String it=rs.getString(3);
			System.out.println("   "+id+"        "+name+"    "+it);
		System.out.println("---------------------------------------------");
		st.close();
		con.close();
		
	}
	static int registerPat_id() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","root");
		Statement st = con.createStatement();
		String query="select patient_id from userdetail ORDER BY patient_id DESC LIMIT 1";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int id=rs.getInt(1);
		st.close();
		con.close();
		return id;
	}
}