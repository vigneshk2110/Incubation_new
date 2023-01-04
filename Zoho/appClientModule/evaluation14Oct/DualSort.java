package evaluation14Oct;

import java.util.Arrays;
import java.util.Scanner;

public class DualSort {

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
		
		mixSort(array);

	}

	private static void mixSort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		int [] newArray = new int [array.length];
		
		int i = 0;
		int j = array.length-1;
		int k = 0;
		
		while(i<=j) {
			if (k%2 == 0) {
				newArray[k++] = array[i];
				i++;
			}
			if (k%2 == 1) {
				newArray[k++] = array[j];
				j--;
			}
			
		}
		
		System.out.println(Arrays.toString(newArray));
	}

}
