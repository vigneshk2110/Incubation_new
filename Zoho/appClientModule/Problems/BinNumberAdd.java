package Problems;

import java.util.Scanner;

public class BinNumberAdd {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please a binary number of 9 digit or less to add");
		int num1 = scan.nextInt();
		System.out.println("Please a binary number 9 digit or less to add");
		int num2 = scan.nextInt();
		
		add(num1,num2);
		
		scan.close();

	}

	private static void add(int num1, int num2) {
		
		int i =0;
		int carry =0;
		int[] total = new int[10];
		
		while (num1 !=0 || num2!= 0) {
			total[i] = (num1%10 + num2%10 +carry)%2;
			carry = (num1%10 + num2%10 +carry)/2;
			num1 = num1/10;
			num2 = num2/10;
			i++;
		}
		
		if (carry != 0) {
			total[i] = carry;
		}
		
		System.out.print("Output: ");
		while (i >= 0) {
			System.out.print(total[i--]);
		}
		System.out.println();
	}
}
