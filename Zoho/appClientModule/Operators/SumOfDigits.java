package Operators;

public class SumOfDigits {

	public static void main(String[] args) {
		int x = 98765;
		
		sumOFDiGITS(x);

	}

	private static void sumOFDiGITS(int x) {
		int sum = 0;
		
		while (x>0) {
			sum = sum + (x%10);
			x = x/10;			
		}
		
		System.out.println(sum);
	}

}
