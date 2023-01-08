package test1;

import java.util.ArrayList;

public class Prescription {

	private Doctor doc;
	private ArrayList<Medicine> medList;
	private int totalCost;

	Prescription(Doctor doc, ArrayList<Medicine> medList) {
		super();
		this.doc = doc;
		this.medList = medList;
	}	


	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public ArrayList<Medicine> getMedList() {
		return medList;
	}
	

	public void setMedList(ArrayList<Medicine> medList) {
		this.medList = medList;
	}
	
	public void printPrescription() {
		System.out.println("****************************************");
		System.out.println("Doctor's Name - "+ this.getDoc().getDocName() );
		System.out.println("****************************************");
		System.out.println("Medicine Name \tQuantity \tCost");
		
		for (Medicine medicine : medList) {
			System.out.println(medicine.getMedName()+ " : " + medicine.getQuantityAvailable() + " : " + medicine.getCostPerUnit());
			this.totalCost = this.totalCost +  medicine.getCostPerUnit() ;
		}
		
		System.out.println("\t\t\t totalcost : " + totalCost);
		System.out.println("*******************************************");
		
	}


	

}
