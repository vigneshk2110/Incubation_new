package diwali;

import java.util.Scanner;

public class GreaterPreviousElement {

	public static void main(String[] args) {
//		int [] check = {2, -3, -4, 5, 9, 7, 8};
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;
		System.out.println("please enter value for each index " );
		for (int i = 0; i < array.length; i++) {
			
			int index = scan.nextInt();

			array[i] = index;
		}
		
		printNextGreater(array);
		
//		int	a[] = {2,-4,6,8,2,0,112};
//		printNextGreater(a);
	}

	private static void printNextGreater(int[] arr) {
		int max = Integer.MIN_VALUE, i = 0;
		
		
		while (i<arr.length) {
			if (arr[i]>max) {
				max = arr[i];
				System.out.print(max + " ");
			}
			i++;
		}
		System.out.println();
	}
}
