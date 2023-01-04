package Evaluation;

public class Fruit 
{ 
	// Here, Fruit does not have defined a no-arg constructor. 
	// Fruit has defined an explicit constructor.
	public Fruit() 
	{ 
		System.out.println("Implicit fruit constructor"); 
	} 
	public Fruit(int x) 
	{ 
		System.out.println("Explicit fruit constructor defined - " + x); 
	} 
} 
