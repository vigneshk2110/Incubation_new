package view;

public class Doctor extends Admin implements DoctorsInterface {

	private String userType="Doctor";
	private String degree;
	private boolean doneMasters;
	private boolean memberIMA;

	public Doctor(String name, int userID, String passWord, String degree, boolean masters, boolean memberIMA) {
		super(name, userID, passWord);
		
		this.degree = degree;
		this.doneMasters = masters;
		this.memberIMA = memberIMA;
	}
	
	protected Doctor(String name, int userID, String passWord, String degree) {
		super(name, userID, passWord);
		this.degree = degree;
	}

	protected Doctor(String name, int userID, String passWord) {
		super(name, userID, passWord );
		
	}

	protected Doctor() {	
		super();	
	}

	public String getuserType() {
		return this.userType;
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
		super.setPassWord(newPass);
	}

	@Override 
	public String toString() {
		return "Doctor --> name=" + super.getName() + ", userID=" + super.getUserID() + ", userType=" + this.userType + "";
	}

	@Override // Doctor Interface
	public boolean memberIMA() {
		return memberIMA;
	}


}
