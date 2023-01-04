package recursionBasicProblems;

public class PrintWithRecursion {

	public static void main(String[] args) {
		print(5);

	}

	private static void print(int n) {
		if(n==100) {
			return;
		}
		print(n+5);
		System.out.println(n);
	}
}
