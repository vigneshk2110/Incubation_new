package view;

public class Patient {

	private String name;
	private int age;
	private String gender;
	private boolean whetherConsulted;

	protected Patient(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.whetherConsulted = false;
	}

	protected Patient(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.whetherConsulted = false;
	}

	protected Patient() {
		this.whetherConsulted = false;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public boolean isWhetherConsulted() {
		return whetherConsulted;
	}

	@Override
	public String toString() {
		return "Patient --> name=" + name + ", age=" + age + ", gender=" + gender + "";
	}

}
