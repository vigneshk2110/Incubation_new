package recursion;

import java.util.Arrays;

public class ArraySets {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int answer = 0;

		subArrays(array,answer);

	}

	private static void subArrays(int[] array, int answer) {
		if (array.length == 0) {
			System.out.println(answer);
			return;
		}

		int num = array[0];

		int [] arr = Arrays.copyOfRange(array, 1, array.length);
		subArrays(arr, answer);
		subArrays(arr, answer + num);
	}
}
