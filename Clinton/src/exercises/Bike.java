package exercises;

public class Bike extends BikeAbstract implements BikeInterface{
	
	public void modelName() {
		System.out.println("CBR 250 CC");
	}
	
	public void engineType() {
		System.out.println("V-Twin Engine");
	}
	
	@Override
	void capacity() {
		System.out.println("No of Passengers -" + 2);
	}

	@Override
	public void parentCompany() {
		System.out.println("Honda");

	}

	@Override
	public void makeYear() {
		System.out.println(2009);

	}

	

}
