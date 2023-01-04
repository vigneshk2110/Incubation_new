package Docu3;

import java.util.Scanner;

public class OccurenceCount {
	
//	frequency of all elements

	public static void main(String[] args) {
//		int [] arr1 = {2, 3, 2, 6, 1, 6, 2};
//		occurenceNum(arr1);
//		System.out.println("------------");
//		int [] arr = {1, 3, 4, 2, 3, 2, 6, 1, 6, 2, -10, -35,-35, 47, 47};
		
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
		occurenceNum(array);
	}

	private static void occurenceNum(int[] arr) {

		for(int i = 0; i<arr.length; i++) {
			int min = arr[0];
			for(int l = 0; l<arr.length; l++) {
				if(arr[l] != Integer.MAX_VALUE ) {
					if( arr[l]<min) {
						min = arr[l];
					}
				}
			}
			int count = 0;
			for(int j = 0; j<arr.length; j++) {
				if(arr[j] == min) {
					count++;
				}
			}
			if(count != 0 && min != Integer.MAX_VALUE ) {
				System.out.println( min + "--->" + (count));
			}

			for(int j = 0; j<arr.length; j++) {
				if(arr[j] == min) {
					arr[j] = Integer.MAX_VALUE;
				}
			}
		}
	}
}