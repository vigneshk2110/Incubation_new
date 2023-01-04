package diwali;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union2Array {

	public static void main(String[] args) {
//		int arr1[] = {1, 2, 3, 4, 5};
//		int arr2 [] = {0, 1, 2, 3};
		
//		union(arr1, arr2);
		
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
		unionUsingSet(a, b);
		
//		union(a, b);
	}

	private static void unionUsingSet(int[] arr1, int[] arr2) {
		
		Set s = new HashSet<Integer>();
		
	for (int i = 0; i < arr1.length; i++) {
		s.add(arr1[i]);
	}
	for (int i = 0; i < arr2.length; i++) {
		s.add(arr2[i]);
	}
		
	System.out.println(s);
		
	}

	private static void union(int[] arr1, int[] arr2) {
		
		int []result = new int [arr1.length + arr2.length];
		int k = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			result[k++] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			result[k++] = arr2[i];
		}
		
		Arrays.sort(result);
		int count = result.length;
		for (int i = 0; i < result.length-1; i++) {
			if (result[i] == result[i+1]) {
				result[i] = Integer.MAX_VALUE;
				count--;
			}
		}
		
		Arrays.sort(result);
		
		int [] finalResult = new int[count];
		
		for (int i = 0; i < finalResult.length; i++) {
			finalResult[i] = result[i];
		}
		
		
		System.out.println(Arrays.toString(finalResult));
		
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
