package OOPSinheritance;

public class DogMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		Animal animal = new Animal();
		
		Animal dog = new Dog();
		
		System.out.println(dog.legs);
		
//		As Dog extends animal --> variables & methods of Animal class is implicitly available in Dog class
		
		int dogEyes = d.eyes; // Eyes variable is extended from Animal class to dog class
		System.out.println(dogEyes);
		
		d.add(4l,5);
	}

}
