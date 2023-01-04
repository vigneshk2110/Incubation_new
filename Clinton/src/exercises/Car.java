package exercises;

public class Car extends CarAbstract implements CarInterface{

	public void modelName() {
		System.out.println("Q3-Quatro");
	}
	
	public void engineType() {
		System.out.println("2.0Litre- 4-cylinder");
	}
	
	@Override
	void capacity() {
		System.out.println("No of Passengers -" + 6);
	}

	@Override
	public void parentCompany() {
		System.out.println("Audi");

	}

	@Override
	public void makeYear() {
		System.out.println(2015);

	}


}
