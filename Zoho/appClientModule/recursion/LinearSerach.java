package recursion;

import java.util.ArrayList;

public class LinearSerach {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,6,6,7,8};
		//		System.out.println(search(arr, 6));

		int [] arr1 = {2,12,3 ,4,5,6,7,8};
		
		System.out.println(printIndexes(arr,6,arr.length-1));
		
		//		System.out.println(search(arr1,8));

		//		System.out.println(searchfromLast(arr, 6));
		//		
		//		System.out.println(searchfromLast(arr1,8));

//		ArrayList<Integer> answer = new ArrayList<Integer>();


//		System.out.println(printIndexes(arr,6,0,answer));

	}

	private static ArrayList<Integer> printIndexes(int[] arr, int target, int index) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (index < 0) {
			return list;
		}
		if (target == arr[index]) {
			list.add(index);
		}
		list.addAll(printIndexes(arr, target, index-1));
		
		return list;
	}

	private static ArrayList printIndexes(int[] arr, int target, int index, ArrayList<Integer> answer) {
		if (index == arr.length) {
			return answer;
		}
		if (arr[index] == target) {
			answer.add(index);
		}
		return printIndexes(arr, target, index+1, answer);
		
	}

	private static int searchfromLast(int[] arr, int target) {
		return  helperLast(arr, target, arr.length-1);
	}

	private static int helperLast(int[] arr, int target, int index) {
		if (index < 0) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		}
		return  helperLast(arr, target, index-1);
	}

	private static int search(int[] arr, int target) {
		return helper(arr, target, 0);
	}

	private static int helper(int[] arr, int target, int index) {
		if (index == arr.length ) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		}
		return  helper(arr, target, index+1);
	}

}
