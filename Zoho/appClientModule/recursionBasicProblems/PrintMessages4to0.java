package recursionBasicProblems;

public class PrintMessages4to0 {

	public static void main(String[] args) {
		message();

	}

	private static void message() {
		message1();
		System.out.println("Message 0");
		
	}

	private static void message1() {
		message2();
		System.out.println("Message 1");
	
	}

	private static void message2() {
		message3();
		System.out.println("Message 2");
		
	}

	private static void message3() {
		message4();
		System.out.println("Message 3");
		
	}

	private static void message4() {
		System.out.println("Message 4");
	}

}
