package Docu3;

import java.util.*;

// check for pair in A[] with sum as x.

public class PairsWithSumX {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;

		for (int i = 0; i < array.length; i++) {
			System.out.println("please enter value for index " +i);
			int index = scan.nextInt();

			array[i] = index;

		}
		int[] uniqueArray = removeDupes(array);
		
		pairSumX(uniqueArray, 6);
	}

	private static int[] removeDupes(int[] input) {
		Arrays.sort(input);	
		int [] temp = new int[input.length] ;
		temp[0] = input[0];
		int j = 1;
		
		for(int i =1; i<input.length; i++) {
			if(input[i] != input[i-1]) {
				temp[j++] = input[i];
			}
			
		}
		

		return temp;
	}



	//	private static int[] removeDupes(int[] input) {
	//		int [] temp = null ;
	//		for(int i = 0; i<input.length; i++) {
	//			for(int j = i; j<input.length; j++) {
	//				if(input[i] != input[j]) {
	//					temp[i] = input[i];
	//				}
	//			}
	//		}
	//		System.out.println(Arrays.toString(temp));
	//		return temp;
	//	}

	private static void pairSumX(int[] input, int sum) {
		int count =0;

		for(int i = 0; i<input.length; i++) {
			for(int j = i; j<input.length; j++) {
				if(input[i] + input[j] == sum &&  j!= i ) {
					System.out.println(input[i] + "," + input[j]);
					count++;
					input[j] = 0;
				}
			}
			input[i] = 0;
		}

		System.out.println(count +" no of pairs with sum " + sum);
	}

}
