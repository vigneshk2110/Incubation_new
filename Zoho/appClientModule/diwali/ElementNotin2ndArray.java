package diwali;

import java.util.Scanner;

public class ElementNotin2ndArray {

	public static void main(String[] args) {
//		int a[] = {1, 2, 3, 4, 5, 10};
//		int b[] = {2, 3, 1, 0, 5};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] a = new int[size] ;
		
		System.out.println("please enter value for each index " );
		
		for (int i = 0; i < a.length; i++) {
			
			int index = scan.nextInt();

			a[i] = index;
		}
		
		System.out.println("please enter the size of the next Array");

		int size1 = scan.nextInt();
		if (size1<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size1 = scan.nextInt();
		}
		int [] b = new int[size1] ;
		System.out.println("please enter value for each index " );
		
		for (int i = 0; i < b.length; i++) {
			
			int index = scan.nextInt();

			b[i] = index;
		}
		
		notIn2ndArray(a,b);

	}

	private static void notIn2ndArray(int[] a, int[] b) {
		
		System.out.println("\nElement Not present in Array 2 are...");
	
		for (int i = 0; i < a.length; i++) {
			inner:
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					break inner;
				}
				else if (j == b.length-1) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
