package view_model;

import java.util.Scanner;

public class EmployeeLogin {

	public static void main(String[] args) {

	}

	void employeeLogin()  {
		
		System.out.println("Welcome to the Employee Portal");
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the Login Type "
					+ "\n1. Super Admin "
					+ "\n2. Admin"
					+ "\n3. Office Staff"
					+ "\n4. Doctor"
					+ "\n5. Pharmacy");
			option = sc.nextInt();

			if (option == 1 ) {
				SuperAdmin sa1 = new SuperAdmin();
				sa1.login();
			}
			else if (option == 2) {
				Admin admin = new Admin();
				admin.login();
			}
			else if (option == 3) {
				OfficeStaff os1 = new OfficeStaff();
				os1.login();
			}
			else if (option == 4) {
				Doctor doc = new Doctor();
				doc.login();
			}
			else if (option == 5) {
				Pharmacy ph1 = new Pharmacy();
				ph1.login();
			}
			else {
				System.out.println("Thanks, Visit Again");
				flag = false;
			}
		}
	}
}
