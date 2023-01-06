package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private static final String DBdriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBurl = "jdbc:mysql://localhost:3306/hospital";
	private static final String DBUname = "root";
	private static final String DBPass = "root";	


	public Connection getConnection() {

		Connection con = null;
		try {
			Class.forName(DBdriver);
			con = DriverManager.getConnection(DBurl, DBUname, DBPass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		

		return con;
	}

	public void closeCon(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con = null;
	}

	public void closeCon(Connection con, Statement st) {

		try {
			st.close();
			con.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		st =null;
		con = null;		
	}

	public void closeCon(Connection con, PreparedStatement preSt) {
		try {
			preSt.close();
			con.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		preSt =null;
		con = null;		
	}

	public void closeCon(Connection con, CallableStatement callSt) {
		try {
			callSt.close();
			con.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		callSt =null;
		con = null;		
	}

}
