package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import controller.HospitalAssist;

public class Caller {

	public static void main(String[] args) {
		Hospital h1 = setupHospital();		
		HospitalAssist hA = new HospitalAssist();
		hA.addHospital2DB(h1);


		System.out.println("Welcome to XYZ Hospital");

		Scanner scan = new Scanner(System.in);
		int option = 0;

		do {

			System.out.println("Please select any option from the below\n1. Super Admin \n2. Admin \n3. Doctor \n4. Guest");
			option = scan.nextInt();

			switch (option) {
			case 1:
				SuperAdmin s1 = new SuperAdmin();
				s1.login();
				break;
			case 2:
				System.out.println("Admin");
				break;
			case 3:
				System.out.println("Doctor");
				break;
			case 4:
				System.out.println("Guest");
				break;

			default:
				System.out.println("Thanks, Visit Again!!!");
				break;
			}

		} while (option>=1 && option<=4 );

	}

	private static Hospital setupHospital() {

		SuperAdmin supAd = new SuperAdmin("Sugu", 100, "pass");
		Admin ad = new Admin("Sakthi", 101, "pass");
		Doctor doc1 = new Doctor("Murugan", 102, "pass", "MBBS", true, true);
		Doctor doc2 = new Doctor("Senthil", 103, "pass", "MBBS", true, false);
		Doctor doc3 = new Doctor("Karthi", 104, "pass", "MBBS", false, false);
		ArrayList<Doctor> docList = new ArrayList<>();
		docList.add(doc1);
		docList.add(doc2);
		docList.add(doc3);
		Patient p1 = new Patient("Mani", 27, "Male");
		Patient p2 = new Patient("Sakthi", "Female");
		Patient p3 = new Patient("Kumar", 47, "Male");
		Patient p4 = new Patient("Kanimozhi", 36, "Female");
		Patient p5 = new Patient("Jaggu", "Male");
		Queue<Patient> patientQueue = new LinkedList<Patient>();
		patientQueue.add(p1);
		patientQueue.add(p2);
		patientQueue.add(p3);
		patientQueue.add(p4);
		patientQueue.add(p5);

		Hospital h1 = new Hospital(supAd, ad, docList, patientQueue);

		return h1;
	}

}
