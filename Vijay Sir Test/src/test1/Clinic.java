package test1;

import java.util.ArrayList;

public class Clinic {


	private ArrayList<Doctor> docsList;
	private ArrayList<Pharmacy> pharmaList;
	private int clinicID;
	private String clinicName;


	Clinic(ArrayList<Doctor> docsList,ArrayList<Pharmacy> pharmalist1 , int clinicID, String clinicName){
		this.docsList = docsList;
		this.pharmaList = pharmalist1;
		this.clinicID = clinicID;
		this.clinicName = clinicName;
	}

	public Clinic() {
	}

	public String getClinicName() {
		return clinicName;
	}

	public int getClinicID() {
		return clinicID;
	}

	public void listDoctors() {
		System.out.println("List of Doctors\n"
				+ "DocNum\tDocName");

		for (Doctor doctor : docsList) {
			System.out.println(doctor.getDocNum() +"\t " + doctor.getDocName());
		}
	}

	public void listPharmacy() {
		System.out.println("Please choose the medicine by its ID");
		System.out.println("Pharmacy Number \t Medicine Id\t Medicine Name ");
		for (Pharmacy pharmacy : pharmaList) {
			for (Medicine medicine : pharmacy.getMedicineList()) {
				System.out.println("    "+pharmacy.getNum() + medicine.printMedicine());
			}
		}
	}

	public Doctor getDocbyID(int docNum) {
		for (Doctor doc : docsList) {
			if (doc.getDocNum() == docNum) {
				return doc;
			}
		}
		return null;		
	}

	public Medicine getMedbyID(int medicineNum) {
		for (Pharmacy pharmacy : pharmaList) {

			for (Medicine medicine : pharmacy.getMedicineList()) {
				if (medicine.getMedID() == medicineNum) {
					return medicine;
				}
			}
		}		
		return null;
	}
}
