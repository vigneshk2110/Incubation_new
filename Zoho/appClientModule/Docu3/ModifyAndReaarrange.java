package Docu3;

import java.util.Arrays;

import java.util.Scanner;
// r the modification, rearrange the
//array such that all 0’s are shifted to the end.


public class ModifyAndReaarrange {

	public static void main(String[] args) {
//		int	[] arr = {2, 2, 0, 4, 0, 8};
//		
//		int	[]  arr1 =  {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
//		
//		rearrange(arr);
//		rearrange(arr1);
		
		
		
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
		
		rearrange(array);
	}

	private static void rearrange(int[] arr) {
		for(int i = 0; i<arr.length-2; i++) {
			if(arr[i]==arr[i+1]) {
				arr[i] = 2*arr[i];
				arr[i+1] = 0;
			}
		}
		
		int notZero = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]!= 0) {
				if(i>0) {
					notZero++;
				}

				for(int j = i; j>notZero; j--) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			if(arr[i]== 0 && i==0 ) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
