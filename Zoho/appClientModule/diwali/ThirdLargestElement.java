package diwali;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) {
//		int	a[] = {3,5,7,9,11,13};
//		int	a[] = {2,4,1,3,5};
		
		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] a = new int[size] ;

		System.out.println("please enter value for each index ");
		
		for (int i = 0; i < a.length; i++) {
			
			int index = scan.nextInt();

			a[i] = index;
		}
		
		thirdLargestElement(a);

	}

	private static void thirdLargestElement(int[] a) {
		
		Arrays.sort(a);
		
		System.out.println(a[a.length-3]);
		
	}
}

/*
 * Given an array of distinct elements. Find the third largest element
in it. Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be
5 because it is the 3 largest element in the array A.
Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
*/
