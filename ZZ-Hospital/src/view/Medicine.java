package view;

public class Medicine {
	
	private int medID;
	private String medName;
	private int quantityAvailable;
	private int costper10;
	
	protected Medicine(int medID, String medName, int quantityAvailable, int costper10) {
		super();
		this.medID = medID;
		this.medName = medName;
		this.quantityAvailable = quantityAvailable;
		this.costper10 = costper10;
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

	public int getCostper10() {
		return costper10;
	}
	
	

}
