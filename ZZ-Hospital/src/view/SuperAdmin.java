package view;

public class SuperAdmin extends Admin {

	private String userType = "Super Admin";

	protected SuperAdmin(String name, int userID, String passWord) {
		super(name, userID, passWord);
	}

	protected SuperAdmin() {
		super();
	}
	
	public String getuserType() {
		return this.userType;
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
		return "SuperAdmin --> name= " + super.getName() + ", userID= " + super.getUserID() + ", userType= " + userType+"";
	}

}
