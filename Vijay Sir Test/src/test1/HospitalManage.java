package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManage {
	
	private ArrayList<Clinic> clinicList;
	

	HospitalManage(ArrayList<Clinic> clinicList) {
		super();
		this.clinicList = clinicList;
	}
	
	HospitalManage() {
		super();
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		HospitalManage hm = new HospitalManage();
		hm.clinicList = hm.setupHosiptal();
		
		
		Clinic clinic1 = hm.getClinic();

		// Assigning doctor for a patient
		Doctor doc = hm.getDoctor(clinic1);


		// Getting Medicine List & adding to Prescription
		ArrayList<Medicine> medList = hm.getMedList( clinic1);
		

		//		Printing Prescription
		Prescription pres = new Prescription(doc, medList);
		if (medList.size() != 0) {
			pres.printPrescription();
		}
		else {
			System.out.println("No Medicine Prescribed by the Doctor");
		}

	}

	private Clinic getClinic() {
		
		Scanner scan = new Scanner(System.in);
		int clinicNum = 0;
		
		
		do {
			System.out.println("Please Select anyone Clinic from Below or Enter 0 to exit");
			this.listClinic();
			clinicNum = scan.nextInt();
			if (clinicNum == 0) {
				System.out.println("Thanks Visit Again");
				break;
			}
			Clinic clin1 = this.getClinicbyID(clinicNum);
			if (clin1 == null) {
				System.out.println("invalid ClinicID - Re-enter or Enter 0 to complete");
				clinicNum = scan.nextInt();
				if (clinicNum == 0) {
					break;
				}
				clin1 = this.getClinicbyID(clinicNum);
			}
			
			
			
		} while (false);
		
		
		
		return null;
	}

	private Clinic getClinicbyID(int clinicNum) {
		// TODO Auto-generated method stub
		return null;
	}

	private void listClinic() {
		System.out.println("Please Select anyone Clinic from Below\n\n"
				+ "ClinicNum\tClinicName");
		
		for (Clinic clinic : clinicList) {
			System.out.println(clinic.getClinicID() +"\t"+clinic.getClinicName());
		}
		
	}

	private ArrayList<Clinic> setupHosiptal() {
		Clinic clinic1 = this.setupClinic();
		Clinic clinic2 = this.setupClinic1();
		
		ArrayList<Clinic> clinicList1 = new ArrayList<>();
		clinicList1.add(clinic1);clinicList1.add(clinic2);
		
		return clinicList1;
	}

	private ArrayList<Medicine> getMedList( Clinic clinic1) {
		
		ArrayList<Medicine> medList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int medicineNum = 0;
		do {
			clinic1.listPharmacy();
			System.out.println("Enter the MedID or Enter 0 to complete");
			medicineNum = scan.nextInt();
			if (medicineNum == 0) {
				break;
			}
			Medicine med = clinic1.getMedbyID(medicineNum);
			while (med == null) {
				System.out.println("invalid MedID - Re-enter or Enter 0 to complete");
				medicineNum = scan.nextInt();
				if (medicineNum == 0) {
					break;
				}
				med = clinic1.getMedbyID(medicineNum);
			}
			Medicine medi = new Medicine(med);
			System.out.println("Please enter the quantity");
			int count = scan.nextInt();
			while (med.getQuantityAvailable() < count) {
				System.out
				.println("Please enter lesser quantity\nOnly " + med.getQuantityAvailable() + " nos available");
				count = scan.nextInt();
			}
			med.setQuantityAvailable(med.getQuantityAvailable() - count);
			medi.setQuantityAvailable(count);
			medi.setCostPerUnit(medi.getCostPerUnit() * count);
			medList.add(medi);
		} while (medicineNum != 0);
		
		return medList;


	}

	private Doctor getDoctor(Clinic clinic1) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter the Doctor's number you want to visit\n");
		Scanner scan = new Scanner(System.in);
		clinic1.listDoctors();
		int docNum = scan.nextInt();
		Doctor doc = clinic1.getDocbyID(docNum);

		while (doc == null) {
			System.out.println("invalid DocNum - Re-enter ");
			docNum = scan.nextInt();

			doc = clinic1.getDocbyID(docNum);
		}
		return doc;
	}

	private Clinic setupClinic() {
		Doctor d1 = new Doctor(1, "Vignesh");
		Doctor d2 = new Doctor(2, "Gokul");
		Doctor d3 = new Doctor(3, "Amudhan");
		Doctor d4 = new Doctor(4, "Rajesh");
		Doctor d5 = new Doctor(5, "Surya");
		Doctor d6 = new Doctor(6, "Amuthan");
		Doctor d7 = new Doctor(7, "Sneha");
		Doctor d8 = new Doctor(8, "Nibila");
		Doctor d9 = new Doctor(9, "Vijayan");
		Doctor d10 = new Doctor(10, "Jagadeesh");
		
		ArrayList<Doctor> docList = new ArrayList<>();
		
		docList.add(d1);
		docList.add(d2);
		docList.add(d3);
		docList.add(d4);
		docList.add(d5);
		docList.add(d6);
		docList.add(d7);
		docList.add(d8);
		docList.add(d9);
		docList.add(d10);

		Medicine m1 = new Medicine(1, "Para", 1250, 2);
		Medicine m2 = new Medicine(2, "Amox", 1000, 20);
		Medicine m3 = new Medicine(3, "digine", 12500, 12);
		Medicine m4 = new Medicine(4, "1tab4", 125, 25);
		Medicine m5 = new Medicine(5, "1tab5", 100, 200);

		ArrayList<Medicine> mediList1 = new ArrayList<>();
		mediList1.add(m5);
		mediList1.add(m4);
		mediList1.add(m3);
		mediList1.add(m2);
		mediList1.add(m1);

		Pharmacy p1 = new Pharmacy(mediList1, "Pharmacy1", 1);

		Medicine m11 = new Medicine(11, "2Tab1", 1250, 2);
		Medicine m12 = new Medicine(12, "2Tab2", 1000, 20);
		Medicine m13 = new Medicine(13, "2Tab3", 12500, 12);
		Medicine m14 = new Medicine(14, "2Tab4", 125, 25);
		Medicine m15 = new Medicine(15, "2Tab5", 100, 200);

		ArrayList<Medicine> mediList2 = new ArrayList<>();
		mediList2.add(m15);
		mediList2.add(m14);
		mediList2.add(m13);
		mediList2.add(m12);
		mediList2.add(m11);

		Pharmacy p2 = new Pharmacy(mediList2, "Pharmacy2", 2);

		ArrayList<Pharmacy> pharmacyList = new ArrayList<>();
		pharmacyList.add(p1);
		pharmacyList.add(p2);

		Clinic clinic = new Clinic(docList, pharmacyList, 1, "Clinic 2");
		return clinic;
	}
	
	private Clinic setupClinic1() {
		
		Doctor d1 = new Doctor(1, "	Adithya");
		Doctor d2 = new Doctor(2, "Sarvesh");
		Doctor d3 = new Doctor(3, "Manoj");
		Doctor d4 = new Doctor(4, "Mithran");
		Doctor d5 = new Doctor(5, "Suresh");
		Doctor d6 = new Doctor(6, "Dhruvan");
		Doctor d7 = new Doctor(7, "Tharun");
		Doctor d8 = new Doctor(8, "Santhosh");
		Doctor d9 = new Doctor(9, "Pravin");
		Doctor d10 = new Doctor(10, "Hariharan");
		ArrayList<Doctor> docList = new ArrayList<>();
		docList.add(d1);
		docList.add(d2);
		docList.add(d3);
		docList.add(d4);
		docList.add(d5);
		docList.add(d6);
		docList.add(d7);
		docList.add(d8);
		docList.add(d9);
		docList.add(d10);

		Medicine m1 = new Medicine(1, "Amoxicillin", 1250, 2);
		Medicine m2 = new Medicine(2, "Vitamin", 1000, 20);
		Medicine m3 = new Medicine(3, "Azithromycin", 12500, 12);
		Medicine m4 = new Medicine(4, "Amlodipine", 125, 25);
		Medicine m5 = new Medicine(5, "Albuterol", 100, 200);

		ArrayList<Medicine> mediList1 = new ArrayList<>();
		mediList1.add(m5);
		mediList1.add(m4);
		mediList1.add(m3);
		mediList1.add(m2);
		mediList1.add(m1);

		Pharmacy p1 = new Pharmacy(mediList1, "Pharmacy1", 1);

		Medicine m11 = new Medicine(11, "Cyclobenzaprine", 1250, 2);
		Medicine m12 = new Medicine(12, "Hydrochlorothiazide", 1000, 20);
		Medicine m13 = new Medicine(13, "Cephalexin", 12500, 12);
		Medicine m14 = new Medicine(14, "osteomalacia", 125, 25);
		Medicine m15 = new Medicine(15, "Phenazopyridine Hcl", 100, 200);

		ArrayList<Medicine> mediList2 = new ArrayList<>();
		mediList2.add(m15);
		mediList2.add(m14);
		mediList2.add(m13);
		mediList2.add(m12);
		mediList2.add(m11);

		Pharmacy p2 = new Pharmacy(mediList2, "Pharmacy2", 2);

		ArrayList<Pharmacy> pharmacyList = new ArrayList<>();
		pharmacyList.add(p1);
		pharmacyList.add(p2);

		Clinic clinic = new Clinic(docList, pharmacyList, 2, "Clinic 2");
		return clinic;
	}

}
