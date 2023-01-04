package recursion;

import java.util.Arrays;

public class ReverseArray1Pointer {

	public static void main(String[] args) {
		int arr [] = { 2, 3, 5, 8, 9};
		reverse(arr, 0);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr, int i) {
		
		if (i == arr.length/2) {
			return;
		}
		
		swap(arr, i, arr.length-1-i);
		
		reverse(arr, i+1);
		
		
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
