package recursion;

public class Factorial {
	static int [] array = new int[10000];
	public static void main(String[] args) {

		int result = factorial(16);
		System.out.println(result);
	}
	private static int factorial(int num) {

		if (num == 1) {
			return 1;
		}
		
		else {
			return num * factorial(num - 1);
		}
	}
}
