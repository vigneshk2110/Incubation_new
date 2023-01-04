package recursion;

public class ParameterisedCall {

	public static void main(String[] args) {

//		sum(5, 0);
		
//		System.out.println(sumFunction(5));
		
		System.out.println(factorial(5));

	}

	private static int factorial(int n) {
		
		if (n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}

	private static int sumFunction(int n) {
		if (n == 0) {
			return 0;
		}
		
		return n+sumFunction(n-1);
	}

	private static void sum(int n, int sum) {
		
		if (n<1) {
			System.out.println(sum);
			return;
		}
		
		sum(n-1, sum+n);
		
	}

}
