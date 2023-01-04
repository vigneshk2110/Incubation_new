package Problems;

/*minimum
and maximum elements in the array*/


public class MaxMin {
	
	

	public static void main(String[] args) {
		int [] a = {3, 2, 1, 56, 10000, 167};
		int [] b = {10, 345, -234, 21, 56789};
		int []c = {3};
		
		maxMin(c);
		
	}

	private static void maxMin(int[] a) {
		int min = a[0];
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (min>a[i]) {
				min = a[i];
			}
			if (max<a[i]) {
				max = a[i];
			}
		}
		System.out.println(min + " is the minimum number in the array");
		System.out.println(max + " is the maximum number in the array");
	}
}
