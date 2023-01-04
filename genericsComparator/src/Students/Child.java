package Students;

public class Child extends Parent implements Test {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.method1();
		ch.method2();
	}

	@Override
	public void method2() {
		System.out.println("Method 2 - Child Class Implemented");
		
	}


}
