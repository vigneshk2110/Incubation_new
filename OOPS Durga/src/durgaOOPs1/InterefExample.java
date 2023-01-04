package durgaOOPs1;

public class InterefExample extends InterefChild{

	public static void main(String[] args) {
		
		InterefExample ir = new InterefExample();
		ir.name();
		ir.name1();
		ir.example1();
		InterefExample.example();
		Interef.example();
		
	}

	public static void example() {
		System.out.println("This is the static method Reimplemented in Implemented class");
	}

	@Override
	public void name1() {
		// TODO Auto-generated method stub
		
	}

}
