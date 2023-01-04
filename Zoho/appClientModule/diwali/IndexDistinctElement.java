package diwali;

import java.util.Scanner;

public class IndexDistinctElement {

	public static void main(String[] args) {
		//	int	a[] = {3,5,7,9,11,13};
		//	int	b[] = {3,5,7,11,13};

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

		System.out.println("please enter the size of the Array");

		int size1 = scan.nextInt();
		if (size1<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size1 = scan.nextInt();
		}
		int [] b = new int[size1] ;

		System.out.println("please enter value for each index ");
		
		for (int i = 0; i < b.length; i++) {
			
			int index = scan.nextInt();

			b[i] = index;
		}

		distinctNumIndex(a,b);

//		int	A[] = {2,4,6,8,9,10,12};
//		int B[] = {2,4,6,8,10,12};
//
//		distinctNumIndex(A,B);

	}

	private static void distinctNumIndex(int[] a, int[] b) {

		int i = 0, j = 0;

		while (i<a.length && j<b.length) {
			if (a[i] != b[j]) {
				System.out.println(i);
				break;
			}
			i++; j++;
		}

	}

}

/*
 * 6.Given two sorted arrays of distinct elements. There is only 1
difference between the arrays. First array has one element extra added in
between. Find the index of the extra element.
Input:
N = 7
A[] = {2,4,6,8,9,10,12}
B[] = {2,4,6,8,10,12}
Output: 4
 */
