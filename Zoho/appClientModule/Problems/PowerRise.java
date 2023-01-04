package Problems;

import java.util.Scanner;

/*Write a program to find
the value of one number raised to the power of another
*/

public class PowerRise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a num to be raised");
		int base = scan.nextInt();
		System.out.println("please enter the power");
		int exponent = scan.nextInt();
		
		powerRise(base, exponent);
	}

	private static void powerRise(int base, int exponent) {
		
		double answer = base;
		
		if (exponent == 0) {
			answer = 1;
		}
		else if (exponent>0) {
			for (int i = 2; i <= exponent; i++) {
				answer = answer*base;			
			}
		}
		else {
			exponent = Math.abs(exponent);
			for (int i = 2; i <= exponent; i++) {
				answer = answer*base;			
			}
			answer = 1 / answer;
		}
		
		System.out.println(answer);
		
	}
}
