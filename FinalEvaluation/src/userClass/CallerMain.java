package userClass;

import java.sql.SQLException;
import java.util.Scanner;

public class CallerMain {

	static {

		try {
			DBConnect.connectDB();
			DBConnect.query="{call hospitalmanagement.setupNewHospitalDatabase()}"; 
			DBConnect.callStmt = DBConnect.con.prepareCall(DBConnect.query);
			DBConnect.callStmt.execute();
			DBConnect.closeDB();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args){

		System.out.println("Welcome to the XYZ Hospital");
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. Hospital Employee/Admin "
					+ "\n2. Guest User");
			option = sc.nextInt();

			if (option == 1 ) {
				EmployeeLogin empLog = new EmployeeLogin();
				empLog.employeeLogin();
			}
			else if (option == 2) {
				GuestLogin gl = new GuestLogin();
				gl.menu();
			}
			else {
				System.out.println("Thanks, Visit Again");
				flag = false;
			}
		}
	}
}
