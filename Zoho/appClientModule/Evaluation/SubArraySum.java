package Evaluation;

import java.util.Arrays;
import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {

//		int [] input = {2,6,0, 9, 7,3,1,4,1,10};
//		int target = 15;
//		
//		int[] result = subArray(input,target);
//		
//		System.out.println(Arrays.toString(result));
//		
//		int [] input1 = {0,5,-7,1,-4,7,6,1,4,1,10};
//		int target1 = -3;
//		
//		int[] result1 = subArray(input1,target1);
		
		
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
		System.out.println("please enter the target sum");
		int target = scan.nextInt();
		
		int[] result = subArray(array,target);
		
		System.out.println(Arrays.toString(result));

	}

	private static int [] subArray(int[] input, int target) {
		
		int startIndex = 0;
		int endIndex = 0;
		
		
		
		outerLoop:
		for (int i = 0; i < input.length; i++) {
			
			innerLoop:
			for (int j = i+1; j < input.length; j++) {
				if (sum(array(i, j, input)) > target) {
					break innerLoop;
				}
				else if(sum(array(i, j, input)) == target) {
					return array(i, j, input);
				}
				else if (sum(array(i, j, input)) < target && target<0) {
					break innerLoop;
				}
				
			}
		}
		return null;
		
	}

	private static int[] array(int startIndex, int endIndex, int[] input) {
		int index = 0;
		int [] result = new int[(endIndex-startIndex)+1] ;
		for (int i = startIndex; i <= endIndex; i++) {
			result[index++] = input[i];
		}
		return result;
	}
	
	private static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
