package sortingAlgorithms;

import java.util.*;

public class BubbleSort {

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
		
		bubbleSort(array);
	}

	private static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length ; j++) {
				if (array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
