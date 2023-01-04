package OOPSinheritance;

public class LabMain {
	
	//MultiLevel Inheritance - A class inherting properties from 

	public static void main(String[] args) {
		
		Labrador newLab = new Labrador();
		
		System.out.println(newLab.eyes);		// Inherited from Animal
		
		newLab.bark();							// Inherited from Dog
		
		System.out.println(newLab.specialCapability);	//its own property

	}

}
