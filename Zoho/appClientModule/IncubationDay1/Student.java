package IncubationDay1;

public class Student {
	public String name = "vignesh";
	private String iD = "INC-3465";
	private int depositAmt = 5000;
	private String mobileNum = "+91 9865719584";

	public void setName(String name) {
		this.name = name;
	}

	public int getDepositAmt() {
		return depositAmt;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void purchase(int purchaseAmt) {
		this.depositAmt = this.depositAmt - purchaseAmt;
	}

	protected void setID(String iDString) {
		this.iD = iDString;
	}
}
