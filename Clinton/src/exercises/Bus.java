package exercises;

public class Bus extends BusAbstract implements BusInterface {

	public void modelName() {
		System.out.println("Scania - v7");
	}
	
	public void engineType() {
		System.out.println("16.4-litre DC16 Turbo Diesel V8");
	}
	
	@Override
	void capacity() {
		System.out.println("No of Passengers -" + 36);
	}

	@Override
	public void parentCompany() {
		System.out.println("VOLVO");

	}

	@Override
	public void makeYear() {
		System.out.println(2018);

	}
	
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.vehicleType();
		bus1.parentCompany();
		bus1.modelName();
		bus1.engineType();
		bus1.makeYear();
		bus1.capacity();
		
		
		Bike bike1 = new Bike();
		bike1.vehicleType();
		bike1.parentCompany();
		bike1.modelName();
		bike1.engineType();
		bike1.makeYear();
		bike1.capacity();
		
		Car car1 = new Car();
		car1.vehicleType();
		car1.parentCompany();
		car1.modelName();
		car1.engineType();
		car1.makeYear();
		car1.capacity();
		
	}

}
