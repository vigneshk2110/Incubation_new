package oopsConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterNumber {

	public static void main(String[] args) {
//		int []input= {1,2,1};
//		nextBigNums(input);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		
		if (size<0) {
			System.out.println("size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		System.out.println("please enter elements of the array");
		int [] input = new int[size] ;

		for (int i = 0; i < input.length; i++) {

			input[i] = scan.nextInt();
		}
			
		
		nextBigNums(input);
		System.out.println(Arrays.toString(input));

	}

	private static void nextBigNums(int[] input) {

		outer:
		for (int i = 0; i < input.length; i++) {
			if (i == input.length-1 ) {
				for (int j = 0; j < i; j++) {
					if (input[j]>input[i]) {
						input[i] = input[j];
						break outer;
					}
					else if (j == i-1) {
						input[i] = -1;
						break outer;
					}
				}
			}
			inner:
			for (int j = i+1; j < input.length; j++) {
				if (input[j]>input[i]) {
					input[i] = input[j];
					break inner;
				}
				if (j == input.length-1 ) {
					for (int k = 0; k < i; k++) {
						if (input[k]>input[i]) {
							input[i] = input[k];
							break inner;
						}
						else if (k == i-1) {
							input[i] = -1;
							break inner;
						}
					}
				}
			}

		}

	}

}
