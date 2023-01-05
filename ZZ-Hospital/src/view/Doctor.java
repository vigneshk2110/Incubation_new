package view;

public class Doctor extends Admin implements DoctorsInterface {

	private String name;
	private int userID;
	private String passWord;
	private String userType = "Doctor";
	private String degree;
	private boolean doneMasters;
	private boolean memberIMA;


	protected Doctor(String name, int userID, String passWord, String degree, boolean masters, boolean memberIMA) {
		this.name = name;
		this.userID = userID;
		this.passWord = passWord;
		this.degree = degree;
		this.doneMasters = masters;
		this.memberIMA = memberIMA;
	}
	
	protected Doctor(String name, int userID, String passWord, String degree) {
		this.name = name;
		this.userID = userID;
		this.passWord = passWord;
		this.degree = degree;
	}

	protected Doctor(String name, int userID, String passWord) {
		this.name = name;
		this.userID = userID;
		this.passWord = passWord;
	}

	protected Doctor() {		
	}

	public String getName() {
		return name;
	}

	public int getUserID() {
		return userID;
	}
	
	public String getPassword() {
		return passWord;
	}

	public String getuserType() {
		return userType;
	}


	private void setPassWord(String newPass) {
		this.passWord = newPass;
	}
	
	public boolean isDoneMasters() {
		return this.doneMasters;
	}

	public void setDoneMasters(boolean doneMasters) {
		this.doneMasters = doneMasters;
	}

	public boolean isMemberIMA(Doctor d1) {
		return d1.memberIMA;
	}

	public void setMemberIMA(boolean memberIMA) {
		this.memberIMA = memberIMA;
	}

	public String getDegree() {
		return this.degree;
	}

	@Override
	public boolean login() {
		return false;
	}

	@Override
	public void viewMenu() {
	}

	@Override
	public void changePassword(String newPass) {
		setPassWord(newPass);
	}

	@Override 
	public String toString() {
		return "Doctor --> name=" + name + ", userID=" + userID + ", userType=" + userType + "";
	}

	@Override // Doctor Interface
	public boolean memberIMA() {
		return memberIMA;
	}


}
