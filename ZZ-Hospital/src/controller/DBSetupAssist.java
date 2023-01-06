package controller;

import java.sql.*;
import java.util.*;
import model.Database;
import view.*;

public class DBSetupAssist {
	
	

	public void addHospital2DB(Hospital h1) {

		SuperAdmin sup = h1.getSuperAdmim();
		addSuperAdmin2DB(sup);
		Admin ad = h1.getAdmin();
		addAdmin2DB(ad);
		ArrayList<Doctor> docList  = h1.getDoctorList();
		addDoctors2DB(docList);
		Queue<Patient> patientQueue = h1.getPatientQueue();
		addPatient2DB(patientQueue);
	}

	private void addPatient2DB(Queue<Patient> patientQueue) {

		Database db = new Database();
		Connection con = db.getConnection();
		PreparedStatement pst = null;		

		while (!patientQueue.isEmpty()) {
			Patient p1 = patientQueue.remove();
			String query = "insert into hospital.patientList values(?,?,?,?);";

			try {
				pst = con.prepareStatement(query);
				pst.setString(1,p1.getName());
				pst.setInt(2, p1.getAge());
				pst.setString(3, p1.getGender());
				pst.setBoolean(4, false);
				pst.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			finally {

			}

		}
		db.closeCon(con, pst);
	}

	private void addDoctors2DB(ArrayList<Doctor> docList) {

		Database db = new Database();
		Connection con = db.getConnection();
		PreparedStatement pst = null;

		for (Doctor doctor : docList) {

			String query = "insert into hospital.DoctorList values(?,?,?,?,?,?,?);";

			try {
				pst = con.prepareStatement(query);
				pst.setString(1,doctor.getName());
				pst.setInt(2, doctor.getUserID());
				pst.setString(3, doctor.getPassword());
				pst.setString(4, doctor.getDegree());
				pst.setBoolean(5, doctor.isDoneMasters());
				pst.setBoolean(6, doctor.memberIMA());
				pst.setString(7, doctor.getuserType());
				pst.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		db.closeCon(con, pst);

	}

	private void addAdmin2DB(Admin ad) {

		Database db = new Database();
		Connection con = db.getConnection();
		PreparedStatement pst = null;

		String query = "insert into hospital.adminlist values(?,?,?,?);";

		try {
			pst = con.prepareStatement(query);
			pst.setString(1,ad.getName());
			pst.setInt(2, ad.getUserID());
			pst.setString(3, ad.getPassword());
			pst.setString(4, ad.getuserType());
			pst.execute();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		db.closeCon(con, pst);
	}

	private void addSuperAdmin2DB(SuperAdmin sup) {

		Database db = new Database();
		Connection con = db.getConnection();
		PreparedStatement pst = null;

		String query = "insert into hospital.superadminlist values(?,?,?,?);";

		try {
			pst = con.prepareStatement(query);
			pst.setString(1,sup.getName());
			pst.setInt(2, sup.getUserID());
			pst.setString(3, sup.getPassword());
			pst.setString(4, sup.getuserType());
			pst.execute();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		db.closeCon(con, pst);
	}
}
