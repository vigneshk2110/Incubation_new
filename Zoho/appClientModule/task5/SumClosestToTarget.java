package task5;

import java.util.Scanner;

public class SumClosestToTarget {

	public static void main(String[] args) {


//		int []	nums = {10,5,6,1, 2, 3};
//		int target = 11;
		
//		int []	nums = {-1,2,1,-4};
//		int target = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int length = scan.nextInt();
		
		if (length<0) {
			System.out.println("length can't be negative, please enter a +ve number");
			length = scan.nextInt();
		}
		System.out.println("please enter the elemental values of the Array");
		int [] array = new int[length] ;

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();
		}
		
		System.out.println("Enter the target");
		int target = scan.nextInt();

		int result = sumCloseToTarget(array, target);
		System.out.println( "The difference to the target is " + result);

	}

	private static int sumCloseToTarget(int[] nums, int target) {
		int diff = Integer.MAX_VALUE;
		int small1 = 0;
		int small3 = 0;
		int small2 = 0;

		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if (Math.abs(nums[i] + nums[j] + nums[k] - target) <= diff && Math.abs(nums[i] + nums[j] + nums[k] - target) != 0 ) {
						diff = Math.abs(nums[i] + nums[j] + nums[k] - target);
						small1 = nums[i];
						small3 = nums[k];
						small2 = nums[j];
					}
				}
			}
		}
		System.out.println("The sum of 3 integer, " + small1 + "," + small2 + "," + small3 + " is " + (small1+ small2 + small3) );
		return diff;

	}

}



/* Given an integer array nums of length n and an integer target, find
three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
 */