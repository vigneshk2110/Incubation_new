package OOPSabstract;

public class TestAbstract extends AbstractClass {

	public static void main(String[] args) {
		
		TestAbstract a = new TestAbstract();
		a.methodAbstract();
		a.name();
		System.out.println(a.age + " --> age from Inteface");
		a.height();
		a.eyeColor();
	}

	@Override
	public void methodAbstract() {
		System.out.println("This is an abstract Method implemented in this class");
		
	}

}
