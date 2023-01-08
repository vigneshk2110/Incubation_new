package test1;

import java.util.ArrayList;

public class Pharmacy {
	
	private ArrayList<Medicine> medicineList;
	private String name;
	private int num;

	Pharmacy(ArrayList<Medicine> medicineList, String name, int num) {
		super();
		this.medicineList = medicineList;
		this.name = name;
		this.num = num;
	}	
	
	
	public int getNum() {
		return num;
	}


	public ArrayList<Medicine> getMedicineList() {
		return medicineList;
	}


	public void setMedicineList(ArrayList<Medicine> medicineList) {
		this.medicineList = medicineList;
	}


	public String getName() {
		return name;
	}
	

}
