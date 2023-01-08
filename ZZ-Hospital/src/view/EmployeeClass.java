package view;

public abstract class EmployeeClass implements EmployeesInterface {

	private String name;	
	private int userID;
	private String passWord;

	protected EmployeeClass(String name, int userID, String passWord) {
		super();
		this.name = name;
		this.userID = userID;
		this.passWord = passWord;
	}

	protected EmployeeClass() {
		super();
	}

	public abstract  String toString();

	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return passWord;
	}

	public int getUserID() {
		return userID;
	}

	public String getuserType() {
		return this.getClass().getName().replace("view.", "");
	}

	protected void setPassWord(String newPass) {
		this.passWord = newPass;
	}

	@Override
	public void login() {
	}

	@Override
	public void viewMenu() {
	}

	@Override
	public void changePassword(String newPass) {
		setPassWord(newPass);
	}

}
