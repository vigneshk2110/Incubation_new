package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {10, 12, 14, 55, 76, 185, 190};
		int target = 55;

		System.out.println(binarySearch(arr, target, 0, arr.length-1));
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		if (start>end) {
			return -1;
		}
		int mid = (start + end)/2 ;

		if (arr[mid] == target) {
			return mid;
		}	
		else if (arr[mid] < target) {
			return binarySearch(arr, target, mid+1, end);
		}
		else {
			return binarySearch(arr, target, start, mid-1);
		}
	}
}
