package diwali;

import java.util.Arrays;
import java.util.Scanner;

public class WaveLikeArray {

	public static void main(String[] args) {
//			int arr[] = {2,4,7,8,9,10};

//		int arr[] = {1,2,3,4,5};
			
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

		convertToWave(a);
		System.out.println(Arrays.toString(a));

	}

	private static void convertToWave(int[] arr) {

		for (int i = 0; i < arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;

		}
	}
}

/*
 * Given a sorted array arr[] of distinct integers. Sort the array into
a wave-like array(In Place). In other words, arrange the elements into a
sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexico graphically smallest
one.
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
*/
