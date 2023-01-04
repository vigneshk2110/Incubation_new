package Problems;

import java.util.*;

/* Write a Java program that takes a number as input and prints its
multiplication table up to 10.*/


public class TenTables {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = scan.nextInt();
		tenTables(x);
	}
	private static void tenTables(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + n + " = " + i*n);
		}
	}
}
