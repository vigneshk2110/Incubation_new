package recursion;import javax.naming.spi.DirStateFactory.Result;

import Doc4.DigitCount;
import evaluation14Oct.sumPairs;

public class SumOfDigitsRecursion {
	static int sum;
	public static void main(String[] args) {

		//		System.out.println(sum(12345));
		//		System.out.println(prod(12345));
//		revv(1435);
//		System.out.println(sum);
		
		int n = 1435341;
//		int result = reverse(n, DigitCount.digitCount(n));
//		System.out.println(result);
		
		System.out.println(palindrome(n));
		
		
		

	}

	private static boolean palindrome(int n) {
		if (n == reverse(n, DigitCount.digitCount(n))) {
			return true;
		}
		return false;
	}

	private static int reverse(int n, int digitCount) {
		
		if (n%10 ==n) {
			return n;
		}
						
		return (int) ((n%10 * Math.pow(10, digitCount-1)) + reverse(n/10, DigitCount.digitCount(n/10))) ;
	}

	private static void revv(int n) {

		if (n%10 == 0) {
			return ;
		}
		
		int num = n%10;
		sum = sum*10 + num;
		revv(n/10);
	}

	private static int prod(int i) {

		if (i%10 == i) {
			return i;
		}

		return i%10 * prod(i/10);
	}

	private static int sum(int i) {
		if (i == 0) {
			return 0;
		}


		return i%10 + sum(i/10);
	}

}
