package view;

public class SuperAdmin extends Admin {

	private String name;	
	private int userID;
	private String passWord;
	private String userType = "Super Admin";

	protected SuperAdmin(String name, int userID, String passWord) {
		this.name = name;
		this.userID = userID;
		this.passWord = passWord;		
	}

	protected SuperAdmin() {

	}

	public String getName() {
		return name;
	}

	public int getUserID() {
		return userID;
	}

	public String getuserType() {
		return userType;
	}

	private void setPassWord(String newPass) {
		this.passWord = newPass;
	}	

	@Override
	public boolean login() {
		return false;
	}

	@Override
	public void viewMenu() {	

	}

	public String getPassWord() {
		return passWord;
	}

	@Override
	public void changePassword(String newPass) {
		setPassWord(newPass);
	}
	
	@Override
	public String toString() {
		return "SuperAdmin --> name= " + name + ", userID= " + userID + ", userType= " + userType+"";
	}

}
