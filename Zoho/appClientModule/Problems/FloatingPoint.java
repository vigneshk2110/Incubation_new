package Problems;

import java.util.*;

/*.Write a Java program that reads a floating-point number and prints
"zero" if the number is zero. Otherwise, print "positive" or "negative". Add
"small" if the absolute value of the number is less than 1, or "large" if it
exceeds 1,000,000
*/

public class FloatingPoint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter a floating num");

		float n = s.nextFloat();

		process(n);
	}

	private static void process(float n) {
		if (n==0) {
			System.out.println("zero");
		}
		else {
			if (Math.abs(n)<1) {
				System.out.print("small ");	
			}
			else if (Math.abs(n)>1000000) {
				System.out.print("Large ");
			}
			if (n<0) {
				System.out.println("negative ");	
			} else {
				System.out.println("positive ");	
			}
		}
	}
}
