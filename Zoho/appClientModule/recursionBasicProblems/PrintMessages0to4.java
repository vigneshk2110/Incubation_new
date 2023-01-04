package recursionBasicProblems;

public class PrintMessages0to4 {

	public static void main(String[] args) {
		message();
		System.out.println("Function Completes Here");
	}

	private static void message() {
		System.out.println("Message 0");
		message1();
	}

	private static void message1() {

		System.out.println("Message 1");
		message2();
	}

	private static void message2() {
		System.out.println("Message 2");
		message3();
	}

	private static void message3() {
		System.out.println("Message 3");
		message4();
	}

	private static void message4() {
		System.out.println("Message 4");
	}

}
