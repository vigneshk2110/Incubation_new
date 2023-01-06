package view;

public class Admin extends EmployeeClass {


	protected Admin(String name, int userID, String passWord) {
		super(name, userID, passWord);
	}

	protected Admin() {
		super();
	}
	
	@Override
	public void login() {
		
	}

	@Override
	public void viewMenu() {
	}
	
	@Override
	public String toString() {
		return "Admin --> name= " + super.getName() + ", userID= " + super.getUserID() + "";
	}

}
