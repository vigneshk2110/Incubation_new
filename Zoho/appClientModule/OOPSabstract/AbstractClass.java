package OOPSabstract;

public abstract class AbstractClass implements Interface {
	
	public abstract void methodAbstract();	
	
	public void name() {
		System.out.println("Name of the class is \"Abstract\"");
	}
	
	@Override
	public void eyeColor() {
		System.out.println("Blueish green- From Interface");
	}

	@Override
	public void height() {
		System.out.println("6 Feet - From Interface");
		
	}

	
	
}
