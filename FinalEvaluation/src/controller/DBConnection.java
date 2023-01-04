package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

	private static final String DBdriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBurl = "jdbc:mysql://localhost:3306/HospitalManagement";
	private static final String DBUname = "root";
	private static final String DBPass = "root";	

	protected static Connection con;
	protected static Statement stmt;
	protected static PreparedStatement preStmt;
	protected static CallableStatement callStmt;
	protected static ResultSet reSet;
	protected static String query = "";


	public static void connectDB() throws ClassNotFoundException, SQLException {

		Class.forName(DBdriver);
		con = DriverManager.getConnection(DBurl, DBUname, DBPass);
	}

	public static void closeDB() throws SQLException {

		if(!(reSet==null)) {
			reSet.close();
			reSet = null;
		}
		if (!(stmt==null)) {
			stmt.close();
			stmt = null;
		}
		if (!(preStmt==null)) {
			preStmt.close();
			preStmt = null;			
		}		
		if (!(callStmt==null)) {
			callStmt.close();
			callStmt = null;
		}
		if (!(con==null)) {
			con.close();
			con = null; 
		}
	}
}
