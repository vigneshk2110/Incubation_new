package userClass;

import java.util.Scanner;

public class OfficeStaff {

	public OfficeStaff() {
		
	}

	public void login() {

		System.out.println("Please enter the email");
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		try {
			while(!(Hospital.validateEmail(email, "OfficeStaff"))) {
				System.out.println("Please Enter Right email");
				email = scan.next();
			}
			System.out.println("Please enter your Password");
			String passWord = scan.next();

			while (!(Hospital.validateUser(email,passWord))) {
				System.out.println("Please Enter RIGHT Password");
				passWord = scan.next();
			}

			officeStaffMenu();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void officeStaffMenu() {
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("\nPlease select the desired option "
					+ "\n1. View Doctors"
					+ "\n2. Book Appointment "
					+ "\n3. View Appointments"
					+ "");
			option = sc.nextInt();
			
			if (option == 1) {
				Hospital.viewUserList("Doctor");
			}
			else if (option == 2) {
				bookAppointment();
			}
			else if (option == 3) {
				viewAppointments();
			}
			
			else {
				flag = false;
			}
		}
		
	}

	private void viewAppointments() {
		Hospital.viewAppointments();		
	}

	private void bookAppointment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Patient Name");	
		String patientName= sc.nextLine(); 
		System.out.println("Please enter the Patient age");	
		int patientAge= sc.nextInt(); 
		
		Hospital.bookAppointMent(patientName, patientAge);		
	}

}
