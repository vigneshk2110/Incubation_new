package recursion;

public class FactorialPrint {

	public static void main(String[] args) {
		fact(12);
		
	}

	private static int fact(int n) {
		if (n==0) {
			return 1;
		}
		
		int Fact=n*fact(n-1);
		System.out.println(Fact);
		return Fact;
		
	}

}
