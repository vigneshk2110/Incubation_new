package recursion;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr [] = { 2, 3, 5, 8, 9};
		reverse(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr, int left, int right) {
		
		if (left == right) {
			return;
		}
		swap(arr, left,right);
		reverse(arr, left+1, right-1);
		
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
	}

}
