package durga;

public class UnChecked  {
	
//	static int x = 10/0;
	
	public static void main(String[] args) {
		try {
			UnChecked uc = new UnChecked();
			uc.final1(10);
			uc.final1("Ten");
			
			System.out.println("hello");
		} catch (ArithmeticException ae) {
			
		}
	}
	
	final void final1(int a) {
		System.out.println(a);
	}
	
	final void final1(String a) {
		System.out.println(a);
	}


}
