package Operators;

public class BinaryAddition {

	public static void main(String[] args) {

		long b1 = 111000;
		long b2 = 11001111;
		int i = 0, carry = 0;

		//This is to hold the output binary number
		int[] sum = new int[10];

		while (b1 != 0 || b2 != 0) 
		{
			sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
			carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
			b1 = b1 / 10;
			b2 = b2 / 10;
		}
		if (carry != 0) {
			sum[i] = carry;
		}
		
		System.out.print("Output: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");  
	}
}