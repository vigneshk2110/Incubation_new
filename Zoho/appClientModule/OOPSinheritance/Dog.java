package OOPSinheritance;

// Single Inheritance


public class Dog extends Animal{
	
//	As Dog extends animal --> variables & methods of Animal class is implicitly available in Dog class

	String name;
	String bread;
	String color;
	
	int legs = 6;
	
	
	public void wagTails() {
		System.out.println("Dogs wag their tails");
	}
	
	public void bark() {
		System.out.println("Dog barks - Bow Bow ");
	}
	
	public void eatings() {
		System.out.println("Dogs eat fish & meat");
	}
	
	public void add(int a, long b) {
		System.out.println("method 1 called");
		System.out.println(a+b);
	}
	
	public void add(long a, int b) {
		System.out.println("method 2 called");
		System.out.println(b+a);
	}
	
	public void add(int a, int b) {
		System.out.println("method 3 called");
		System.out.println(b+a);
	}

}
