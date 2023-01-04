package recursion;

public class SortedOrNot {

	public static void main(String[] args) {
		int [] arr = {1,2,3 ,4,5,6,7,8};
		System.out.println(checkIfSorted(arr));
		
		int [] arr1 = {2,12,3 ,4,5,6,7,8};
		System.out.println(checkIfSorted(arr1));

	}

	private static boolean checkIfSorted(int[] arr) {
		
		return helper(arr,0);
	}

	private static boolean helper(int[] arr, int index) {
		if (index == arr.length-1) {
			return true;
		}
		else if (arr[index] <= arr[index+1]) {
			return helper(arr, index+1);
		}
		return false;
	}

}
