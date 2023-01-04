package durgaOOPs2;

public class Child extends Parent{
	
	int age = 23;
	
	public static void childMethod() {
		System.out.println("Child");
	}
	
	
//  A new instance method can be created in the subclass having the same signature as the method in the superclass. 
//	The process is referred to as overriding.
	
//	public void name() { 				
//		System.out.println("Name in Child");
//	}
	
//	A new static method can be created in the subclass having the same signature as the method in the superclass. 
//	The process is referred to as hiding

	public static void staticMethod() {
		System.out.println("static Method in Child");
	}
}
