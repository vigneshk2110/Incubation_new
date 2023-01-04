package typeCasting;

public class Test {

	public static void main(String[] args) {
//		String s = new String("Vicky");
//		s=null;
		
		Test ts = new Test();
		ts=null;
		
		
//		System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Main ends");
		
		Object object;

	}
	
	public void finalize() {
		System.out.println("Finalize method called");
	}

}
