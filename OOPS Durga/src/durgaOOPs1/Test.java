package durgaOOPs1;

import durgaOOPs.A1;

public abstract class Test {
A1 news = new A1();  // Public Class

//   B1 newqas = new B1();   ------ Default Class - Cannot be (Accessed) instantiated even if package is imported

	
public abstract void name();
public abstract void age();
}

abstract class Test11 extends Test{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
}
class Test2 extends Test11{

	@Override
	public void age() {
		// TODO Auto-generated method stub
		
	}
	
}
