package diwali;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumFromArray {

	public static void main(String[] args) {
//		int [] nums = {0,1,3,5,2,4};
		
//		int [] nums = {9,6,4,2,3,5,7,0,1};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] a = new int[size] ;
		
		System.out.println("please enter value for each index " );
		
		for (int i = 0; i < a.length; i++) {
			
			int index = scan.nextInt();

			a[i] = index;
		}
		
		System.out.println(numMissing(a));
		
	}

	private static int numMissing(int[] nums) {

			
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				
				return i;
			}
		}
		
		return nums.length;
	}

}
