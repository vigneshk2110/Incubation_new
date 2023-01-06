package view;

import controller.DBEmployeeAssist;

public class SuperAdmin extends EmployeeClass {


	protected SuperAdmin(String name, int userID, String passWord) {
		super(name, userID, passWord);
	}

	protected SuperAdmin() {
		super();
	}	

	@Override
	public void login() {
		DBEmployeeAssist dbe = new DBEmployeeAssist();
		dbe.login(this.getuserType());
		
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
		return "SuperAdmin --> name= " + super.getName() + ", userID= " + super.getUserID() ;
	}

}
