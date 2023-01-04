package evaluation14Oct;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupes {

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
		
		removeDuplicates(array);

	}

	private static void removeDuplicates(int[] array) {
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[j] = Integer.MIN_VALUE;
				}
			}
		}
		
		int countMinValue = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == Integer.MIN_VALUE) {
				countMinValue++;
			}
		}
		
		int [] newArray = new int[array.length - countMinValue];
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != Integer.MIN_VALUE) {
				newArray[j++] = array[i];
			}
		}
		
		System.out.println(Arrays.toString(newArray));
	}
	
	

}
