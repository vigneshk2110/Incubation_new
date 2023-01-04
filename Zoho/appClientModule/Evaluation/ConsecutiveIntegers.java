package Evaluation;

import java.util.Scanner;

public class ConsecutiveIntegers {

	public static void main(String[] args) {
//		int [] input = {-1,5,4,2,0,3,1};
//		isConsecutive(input);
//		
//		int [] input1 = {4,2,4,3,1};
//		isConsecutive(input1);
		
		
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
		
		isConsecutive(array);

	}

	private static void isConsecutive(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				if (input[i]>input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			
		}
		
		for (int i = 0; i < input.length-1; i++) {
			if (input[i+1]-input[i] != 1) {
				System.out.println("Not consecutive Numbers");
				return;
			}
		}
		
		System.out.println("Yes, Numbers are consecutive");
		
	}

}
