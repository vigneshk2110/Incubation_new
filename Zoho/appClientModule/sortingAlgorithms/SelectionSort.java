package sortingAlgorithms;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;

		System.out.println("please enter value for each index of the array");

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();
		}

		selectionSort(array);

	}

	private static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min_idx])
					min_idx = j;
			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
