package view_model;

import java.util.Scanner;

import controller.DAOHospitalOperations;

public class SuperAdmin {

	protected SuperAdmin() {

	}

	public void login() {
		System.out.println("Please enter the email");
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		try {
			while (!(DAOHospitalOperations.validateEmail(email, "SuperAdmin"))) {
				System.out.println("Please Enter Right email");
				email = scan.next();
			}
			System.out.println("Please enter your Password");
			String passWord = scan.next();

			while (!(DAOHospitalOperations.validateUser(email, passWord))) {
				System.out.println("Please Enter RIGHT Password");
				passWord = scan.next();
			}

			superAdminMenu();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private void superAdminMenu() {

		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option " + "\n1. Manage Employees " + "\n2. Book Appointment "
					+ "\n3. Manage Finance" + "");
			option = sc.nextInt();

			if (option == 1) {
				manageEmployee();
			} else if (option == 2) {
				bookAppointment();
			} else if (option == 3) {
				manageFinance();
			}

			else {
				flag = false;
			}
		}

	}

	private void manageEmployee() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option " + "\n1. Manage Doctors" + "\n2. Manage Admins "
					+ "\n3. Manage Drivers" + "\n4. Manage OfficeStaffs" + "\n5. View All Staffs");
			option = sc.nextInt();

			if (option == 1) {
				manageUsers("Doctor");
			} else if (option == 2) {
				manageUsers("Admin");
			} else if (option == 3) {
				manageUsers("Driver");
			} else if (option == 4) {
				manageUsers("OfficeStaff");
			} else if (option == 5) {
				DAOHospitalOperations.viewUserList();
				;
			} else {
				flag = false;
			}
		}

	}

	private void manageUsers(String userType) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option " + "\n1. Add " + userType + "" + "\n2. Remove "
					+ userType + "" + "\n3. View " + userType + "" + "");
			option = sc.nextInt();

			if (option == 1) {
				DAOHospitalOperations.addUser(userType);
			} else if (option == 2) {
				DAOHospitalOperations.removeUser(userType);
			} else if (option == 3) {
				DAOHospitalOperations.viewUserList(userType);
			}

			else {
				flag = false;
			}
		}

	}

	private void bookAppointment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Patient Name");
		String patientName = sc.nextLine();
		System.out.println("Please enter the Patient age");
		int patientAge = sc.nextInt();

		DAOHospitalOperations.bookAppointMent(patientName, patientAge);

	}

	private void manageFinance() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option " + "\n1. Deposit Cash to Hospital Account"
					+ "\n2. Transfer to Owner's Account " + "\n3. View Financial statement");
			option = sc.nextInt();

			if (option == 1) {
				depositCash();
			} else if (option == 2) {
				transferCash();
			} else if (option == 3) {
				viewTransaction();
			} else {
				flag = false;
			}
		}
	}

	private void viewTransaction() {
		DAOHospitalOperations.viewTransaction();
	}

	private void transferCash() {
		System.out.println("Please enter the Amount to be Transferred");
		Scanner sc = new Scanner(System.in);
		double transferAmount = sc.nextDouble();
		while (transferAmount < 0) {
			System.out.println("Transfering amount cannot be negative");
			transferAmount = sc.nextDouble();
		}
		DAOHospitalOperations.transfer(transferAmount);

	}

	private void depositCash() {
		System.out.println("Please enter the Amount to be Deposited");
		Scanner sc = new Scanner(System.in);
		double depositAmount = sc.nextDouble();
		while (depositAmount < 0) {
			System.out.println("Deposit amount cannot be negative");
			depositAmount = sc.nextDouble();
		}
		DAOHospitalOperations.deposit(depositAmount);

	}

}