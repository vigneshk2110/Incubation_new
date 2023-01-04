package view_model;

import java.util.Scanner;

import controller.DAOHospitalOperations;

public class Doctor {
	
	public Doctor() {
		
	}

	public void login() {

		System.out.println("Please enter the email");
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		try {
			while(!(DAOHospitalOperations.validateEmail(email, "Doctor"))) {
				System.out.println("Please Enter Right email");
				email = scan.next();
			}
			System.out.println("Please enter your Password");
			String passWord = scan.next();

			while (!(DAOHospitalOperations.validateUser(email,passWord))) {
				System.out.println("Please Enter RIGHT Password");
				passWord = scan.next();
			}
			
			int docID  = findDocUserID(email);

			doctorMenu(docID);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private int findDocUserID(String email) {
		return DAOHospitalOperations.findDocID(email);
	}

	private void doctorMenu(int docID) {
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. View Appointments"
					+ "\n2. Book Appointment "
					+ "\n3. Consult Patient"
					);
			option = sc.nextInt();
			
			if (option == 1) {
				
				DAOHospitalOperations.viewAppointments(docID);
			}
			else if (option == 2) {
				System.out.println("Book Appointments");
				bookAppointment();
			}
			else if (option == 3) {
				DAOHospitalOperations.consultPatient(docID);
			}
			
			else {
				flag = false;
			}
		}
		
	}

	private void bookAppointment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Patient Name");	
		String patientName= sc.nextLine(); 
		System.out.println("Please enter the Patient age");	
		int patientAge= sc.nextInt(); 
		
		DAOHospitalOperations.bookAppointMent(patientName, patientAge);
		
	}
}
