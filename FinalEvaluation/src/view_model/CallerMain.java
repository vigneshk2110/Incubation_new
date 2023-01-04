package view_model;

import java.util.Scanner;
import controller.DbStart;

public class CallerMain {
	
	public static void main(String[] args){
		
		DbStart.dbSetUp();
		

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
