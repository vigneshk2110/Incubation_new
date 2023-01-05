package view;

import java.util.ArrayList;
import java.util.Queue;

public class Hospital {

	private SuperAdmin supAdm1;
	private Admin admin1;
	private  ArrayList<Doctor> docs;
	private Queue<Patient> patientQueue;

	
	protected Hospital() {
	}

	protected Hospital(SuperAdmin supAdm1, Admin admin1, ArrayList<Doctor> docs, Queue<Patient> patientQueue) {
		this.supAdm1 = supAdm1;
		this.admin1 = admin1;
		this.docs = docs;
		this.patientQueue = patientQueue;
	}
	
	protected Hospital(SuperAdmin supAdm1, Admin admin1, ArrayList<Doctor> docs) {
		this.supAdm1 = supAdm1;
		this.admin1 = admin1;
		this.docs = docs;
	}
	
	public SuperAdmin getSuperAdmim() {
		return supAdm1;
	}

	public Admin getAdmin() {
		return admin1;
	}

	public ArrayList<Doctor> getDoctorList() {
		return docs;
	}

	public Queue<Patient> getPatientQueue() {
		return patientQueue;
	}

}
