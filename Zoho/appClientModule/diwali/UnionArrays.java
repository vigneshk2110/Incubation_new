package diwali;

import java.util.Arrays;
import java.util.Scanner;

public class UnionArrays {

	public static void main(String[] args) {
//		int arr1[] = {1, 2, 3, 4, 5};
//		int arr2 [] = {0, 1, 2, 3};
		
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

		union(a, b);

	}

	private static void union(int[] arr1, int[] arr2) {

		int []result = new int [arr1.length + arr2.length];
		int k = 0, i = 0, j = 0;


		while (i<arr1.length || j<arr2.length) {
			if (i<arr1.length && j<arr2.length) {

				if (arr1[i]<arr2[j]) {
					result[k++] = arr1[i++];
				}
				else if (arr1[i]>arr2[j]) {
					result[k++] = arr2[j++];
				}
				else if (arr1[i]==arr2[j]) {
					result[k++] = arr2[j++];
					i++;
				}
			}
			else if (i == arr1.length) {
				result[k++] = arr2[j++];
			}
			else if (j == arr2.length) {
				result[k++] = arr1[i++];
			}
		}

		System.out.println(Arrays.toString(result));
	}

}

/*
 *  Union of two arrays can be defined as the common and distinct elements
in the two arrays. Given two sorted arrays of size n and m respectively,
find their union.
Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
*/