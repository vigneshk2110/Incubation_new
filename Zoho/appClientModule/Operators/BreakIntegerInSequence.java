package Operators;

public class BreakIntegerInSequence {

	public static void main(String[] args) {
		int x = 12304;
		breakNum(x);
		System.out.println();
		
		x = Integer.MAX_VALUE;
		breakNum(x);
	}

	private static void breakNum(int x) {
		int [] arr = new int[nosDigit(x)];
		int i = 1;
		while (x>0) {
			arr[arr.length-i] = x%10;
			x = x/10;
			i++;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	private static int nosDigit(int x) {

		int noOfDigits = 0;

		if (x<0) {
			x = -1*x;
		}

		while (x>0) {
			noOfDigits++;
			x = x/10;
		}
		System.out.println(noOfDigits);
		return noOfDigits;

	}

}
