package durgaOOPs2;

public class Caller {

	public static void main(String[] args) {
		 
		Parent p1 = new Parent();
		p1.parentMethod();
		p1.name();
		System.out.println(p1.hashCode());
//		p1.staticMethod();
//		p1.childMethod();   - Child method is not available to Parent
		
		Child c1 = new Child();
		c1.parentMethod();
		c1.childMethod(); // Both child & parent methods are available for child object
		c1.name();
		
		int num = c1.age;
		System.out.println(c1.hashCode());
		
		c1.staticMethod();
		
		Parent p2 = new Child();
		p2.parentMethod();
		System.out.println(p2.hashCode());
//		p2.childMethod();   Child Method is not available to child object of Parent reference.
//		p2.staticMethod();  //though child object of parent reference - static method of Parent is only executed
		p2.name();         // though child object of parent reference - non static method of Child is only executed
		
		
//		Child c2 = new Parent();   Type mismatch: cannot convert from Parent to Child
		
//		Child c2 = (Child)new Parent(); // Parent cannot be cast to durgaOOPs2.Child
//		c2.parentMethod(); 
//		c2.childMethod();
 
	}

}
