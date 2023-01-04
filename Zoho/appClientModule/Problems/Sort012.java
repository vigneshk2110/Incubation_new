package Problems;

import java.util.Arrays;

public class Sort012 {

	public static void main(String [] args) {
		int [] a = {1,0,1,0,2, 1, 2,0};
		sortArr(a);

	}

	private static void sortArr(int[] a) {

		int startIndex = 0;		
		int endIndex = a.length-1;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == 0 && j>startIndex) {
					swap(startIndex, j, a);
					startIndex++;
					j--;
				}
				else if (a[j] == 2 && j<endIndex) {
					swap(endIndex, j, a);
					endIndex--;
					j--;
				}
			}
		System.out.println(Arrays.toString(a));
	}

	private static void swap(int startIndex, int endIndex, int[] a) {
		int temp = a[startIndex];
		a[startIndex] = a[endIndex];
		a[endIndex] = temp;
	}
}
