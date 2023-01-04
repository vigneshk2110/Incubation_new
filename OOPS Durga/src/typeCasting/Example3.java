package typeCasting;

public class Example3 extends Example2 {
	
	int x = 12;
	static int y = 17;

	public void name() {
		System.out.println("Name3");
	}
	
	public static void m1() {
		System.out.println("m3 - Static");
	}
	
	public static void main(String[] args) {
		Example3 em3 = new Example3();
		em3.name();
		System.out.println(em3.x);
		
		
		((Example2)em3).name();
		System.out.println(((Example2)em3).x);
		
		
		
		((Example1)(Example2)em3).name();
		System.out.println(	((Example1)(Example2)em3).x);
		
		
		
//		JVM is responsible for Method Resolution
//		All the three methods calls will execute only the Example3's Method though we type cast to Example2 or Example1
//		Because Method OverRiding happens on the basis of Runtime Object creation and not by referenced type class
		
		System.out.println("\nStatic Methods");
		Example3 em2 = new Example3();
		em2.m1();
		
		((Example2)em2).m1();
		
		((Example1)(Example2)em2).m1();
		
		
		System.out.println("\nStatic Variables");
		System.out.println(em3.y);
		System.out.println(((Example2)em3).y);
		System.out.println(	((Example1)(Example2)em3).y);
		
//		Compiler is responsible for static Method Resolution & Static variables
//		So Referenced Class Method & variable will only be called not the RunTime obj's method & variable
//		OverRiding Static methods are called Method Hiding
		
	}
	

	
}
