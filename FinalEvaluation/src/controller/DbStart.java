package controller;

import java.sql.SQLException;

public class DbStart {
	
	public static void dbSetUp() {
		try {
			DBConnection.connectDB();
			DBConnection.query="{call hospitalmanagement.setupNewHospitalDatabase()}"; 
			DBConnection.callStmt = DBConnection.con.prepareCall(DBConnection.query);
			DBConnection.callStmt.execute();
			DBConnection.closeDB();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
