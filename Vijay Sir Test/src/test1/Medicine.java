package test1;

public class Medicine {

	private int medID;
	private String medName;
	private int quantityAvailable;
	private int costPerUnit;

	Medicine(int medID, String medName, int quantityAvailable, int costper10) {
		super();
		this.medID = medID;
		this.medName = medName;
		this.quantityAvailable = quantityAvailable;
		this.costPerUnit = costper10;
	}

	public Medicine(Medicine med) {
		this.medID = med.medID;
		this.medName = med.medName;
		this.quantityAvailable = med.quantityAvailable;
		this.costPerUnit = med.costPerUnit;
	}

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public int getMedID() {
		return medID;
	}

	public String getMedName() {
		return medName;
	}

	public String printMedicine() {
//		return "Medichine ID  : " + medID + " ||  Medichine Name  : " + medName ;
		return "   \t\t\t" + medID + "\t " + medName ;
	}


}
