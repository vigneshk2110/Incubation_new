package diwali;

import java.util.Arrays;
import java.util.Scanner;

public class Median2Arrays {

	public static void main(String[] args) {
//		int array1[] = {1,5};
//		int	array2[] = {2,3,6,7};
	
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

		median(a,b);

	}

	private static void median(int[] arr1, int[] arr2) {
		
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
		
//		System.out.println(Arrays.toString(result));
		
		if (result.length%2 == 1) {
			System.out.println(result[(result.length/2) ]);
		}
		else {
			System.out.println((result[(result.length/2)] + result[(result.length/2)-1])/2);
		}
	}

}

/*
 * Given two sorted arrays array1 and array2 of size m and n
respectively. Find the median of the two sorted arrays.
Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
*/
