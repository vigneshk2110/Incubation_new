package view_model;

import java.util.Scanner;

import controller.DAOHospitalOperations;

public class Admin {

	protected Admin() {
	}

	public void login() {

		System.out.println("Please enter the email");
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		try {
			while(!(DAOHospitalOperations.validateEmail(email, "Admin"))) {
				System.out.println("Please Enter Right email");
				email = scan.next();
			}
			System.out.println("Please enter your Password");
			String passWord = scan.next();

			while (!(DAOHospitalOperations.validateUser(email,passWord))) {
				System.out.println("Please Enter RIGHT Password");
				passWord = scan.next();
			}

			adminMenu();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void adminMenu() {

		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. Manage Ambulence "
					+ "\n2. Book Appointment "
					+ "\n3. Manage Payments"
					+ "");
			option = sc.nextInt();

			if (option == 1) {
				manageAmbulence();
			}
			else if (option == 2) {
				bookAppointment();
			}
			else if (option == 3) {
				managePayments();
			}

			else {
				flag = false;
			}
		}

	}

	private void managePayments() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. Payout to Vendors"
					+ "\n2. Collect PayIn from Lab & Scans"
					);
			option = sc.nextInt();

			if (option == 1) {
				vendorsPayOut();
			}
			else if (option == 2) {
				payinCollects();
			}
			else {
				flag = false;
			}
		}

	}

	private void payinCollects() {
		System.out.println("Please enter the Amount to be Collected");
		Scanner sc = new Scanner(System.in);
		double payInAmount = sc.nextDouble();
		while (payInAmount<0) {
			System.out.println("PayIn amount cannot be negative");
			payInAmount = sc.nextDouble();
		}
		DAOHospitalOperations.payIn(payInAmount);
	}

	private void vendorsPayOut() {
		System.out.println("Please enter the Amount to be paid Out");
		Scanner sc = new Scanner(System.in);
		double payOutAmount = sc.nextDouble();
		while (payOutAmount<0) {
			System.out.println("Payout amount cannot be negative");
			payOutAmount = sc.nextDouble();
		}
		DAOHospitalOperations.payOut(payOutAmount);		
	}

	private void bookAppointment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Patient Name");	
		String patientName= sc.nextLine(); 
		System.out.println("Please enter the Patient age");	
		int patientAge= sc.nextInt(); 
		
		DAOHospitalOperations.bookAppointMent(patientName, patientAge);

	}

	private void manageAmbulence() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. View Ambulence Availability"
					+ "\n2. Assign an Ambulence "
					+ "\n3. Change Status"
					);
			option = sc.nextInt();

			if (option == 1) {
				DAOHospitalOperations.ambulenceAvailability();
			}
			else if (option == 2) {
				DAOHospitalOperations.assignAmbulence();
			}
			else if (option == 3) {
				DAOHospitalOperations.changeStatus();
			}
			else {
				flag = false;
			}
		}

	}

}
