package view_model;

import java.util.Scanner;

import controller.DAOHospitalOperations;

public class GuestLogin {

	public void menu() {		
		
		System.out.println("Welcome to the Guest Page!!!");

		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		while (flag) {
			System.out.println("\nPlease select Desired Option from below\n"
					+ "\n1. View Doctor's List"
					+ "\n2. Book an Appointment");

			int option = scan.nextInt();

			if (option == 1 ) {
				DAOHospitalOperations.listSpeciality();
			}
			else if (option == 2) {
				bookAppointment();
			}
			else {
				System.out.println("Thanks, Visit Again");
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