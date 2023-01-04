package Docu2;

import java.util.*;

public class SegregatePositiveNegative {

	public static void main(String[] args) {
				int [] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
		
				sortArray(arr);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("please enter the size of the Array");
//
//		int size = scan.nextInt();
//		int [] unsortedArray = new int[size] ;
//
//		for (int i = 0; i < unsortedArray.length; i++) {
//			System.out.println("please enter value for index " +i);
//			int index = scan.nextInt();
//
//			unsortedArray[i] = index;
//
//		}
//		System.out.println(Arrays.toString(unsortedArray));
//
//		sortArray(unsortedArray);
	}

	private static void sortArray(int[] arr) {
		int positiveIndex = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i]>=0) {
				positiveIndex++;

				for (int j = i; j>positiveIndex; j--) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
