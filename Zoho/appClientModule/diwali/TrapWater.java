package diwali;

import java.util.Scanner;

public class TrapWater {

	public static void main(String[] args) {
		//		int[] arr = { 3, 1, 0, 0, 2, 4};
//		int[] arr = { 2,0,0,4,1,2,3 };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the No of the Blocks");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] arr = new int[size] ;
		System.out.println("please enter height of each block ");
		
		for (int i = 0; i < arr.length; i++) {
			
			int index = scan.nextInt();

			arr[i] = index;
		}
		
		waterTrap(arr);

	}

	private static void waterTrap(int[] arr) {

		int water = 0;

		for (int i = 1; i < arr.length-1; i++) {

			int left = arr[i];
			for (int j = 0; j < i; j++) {
				left = Math.max(left, arr[j]);
			}

			int right = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				right = Math.max(right, arr[j]);
			}

			water = water + (Math.min(left, right) - arr[i]);
		}

		System.out.println(water);

	}

}

/* Given an array arr[] of N non-negative integers representing the
height of blocks. If width of each block is 1, compute how much water
can be trapped between the blocks during the rainy season.
Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
*/