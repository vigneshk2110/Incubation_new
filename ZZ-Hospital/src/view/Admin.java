package view;

public class Admin implements Employees {

	private String name;	
	private int userID;
	private String passWord;
	private String userType = "Admin";


	protected Admin(String name, int userID, String passWord) {
		this.name = name;
		this.userID = userID;
		this.passWord = passWord;
	}

	protected Admin() {
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

	@Override
	public void changePassword(String newPass) {
		setPassWord(newPass);
	}

	@Override
	public String toString() {
		return "Admin --> name= " + name + ", userID= " + userID + "";
	}

	public String getPassword() {
		return passWord;
	}


}
