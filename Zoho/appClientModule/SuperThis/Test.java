package SuperThis;

public class Test {
	
	public static void main(String[] args) {
		Child ch1 = new Child(5);
	}
}

class Parent {
	
	Parent() {
		System.out.println("Parent Class called");
	}
	Parent(int i) {
		System.out.println("Parent Class with Parameter - Integer");
	}
	
}

class Child extends Parent{
	
	Child(int i) {
		super();
		System.out.println("Child Class with Parameter - Integer");
	}
}

