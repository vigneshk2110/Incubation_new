package Evaluation;

import java.util.Scanner;

public class Unique3DigitNum {

	public static void main(String[] args) {
		int [] input = {1,2,3,4};
		
		unique(input);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("please enter the size of the Array");
//
//		int size = scan.nextInt();
//		if (size<0) {
//			System.out.println("Size can't be negative, please enter a +ve number");
//			size = scan.nextInt();
//		}
//		int [] array = new int[size] ;
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("please enter value for index " +i);
//			int index = scan.nextInt();
//
//			array[i] = index;
//		}
//		
//		unique(array);

	}

	private static void unique(int[] input) {
		
		String [] result = new String[4*3*2*1];
		String s = "";
		int count = 0;
	
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int k = 0; k < input.length; k++) {
					if (i!=j && j!=k && i!=k) {
						result[count++] = "" +  input[i] + "" + input[j] + "" + input[k];
					}
				}
			}
		}
		System.out.println("total no of unique pairs are " + count);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
