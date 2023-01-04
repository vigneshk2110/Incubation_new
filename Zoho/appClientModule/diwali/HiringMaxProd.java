package diwali;

import java.util.Arrays;
import java.util.Scanner;

public class HiringMaxProd {

	public static void main(String[] args) {

//		int [] arr = {10, 3, 5, 6, 20};
//		maxProd(arr);

//		int Arr[] = {-10, -3, -5, -6, -20};
//		int Arr[] = {-1,-4,-3,-6,-7,-2};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the no of Personel");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;
		System.out.println("please enter ability of each person " );
		for (int i = 0; i < array.length; i++) {
			
			int index = scan.nextInt();

			array[i] = index;
		}
		
		
		maxProd(array);

	}

	private static void maxProd(int[] arr) {

		Arrays.sort(arr);

		if (arr[0] < 0 && arr[1]<0 && arr[arr.length-1]>0) {
			System.out.println(arr[0]+ ","+ arr[1]+ ","+ arr[arr.length-1]);
			System.out.println(arr[arr.length-1]*arr[0]*arr[1]);
		}
		else {
			System.out.println(arr[arr.length-1]+ ","+ arr[arr.length-2]+ ","+ arr[arr.length-3]);
			System.out.println(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
		}

	}

}
/*
 * 11.The hiring team aims to find 3 candidates who are great collectively.
Each candidate has his or her ability expressed as an integer. 3
candidates are great collectively if product of their abilities is
maximum. Given abilities of N candidates in an array arr[], find the
maximum collective ability from the given pool of candidates.
Input:
N = 5
Arr[] = {10, 3, 5, 6, 20}
Output: 1200
*/
