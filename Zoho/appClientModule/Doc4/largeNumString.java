package Doc4;

import java.util.Arrays;

public class largeNumString {

	public static void main(String[] args) {
		int[] nums = {30,3,30,34,30,20,5,9,35, 30,4};

		String s = 	largeNumString(nums);
		System.out.println(s);
	}

	private static String largeNumString(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {

				if(mSDigit(nums[i])<mSDigit(nums[j])) {
					swap(i, j, nums);
				}

				if(mSDigit(nums[i])==mSDigit(nums[j])) {
					if (sSDigit(nums[i])<sSDigit(nums[j])) {
						swap(i, j, nums);
					}
					
					if (sSDigit(nums[i])==sSDigit(nums[j]) && digitCount(nums[i])>digitCount(nums[j])) {
						swap(i, j, nums);
					}
				}
			}
		}

		String s = "";

		for (int i = 0; i < nums.length; i++) {
			s = s+nums[i];
		}

		System.out.println(Arrays.toString(nums));

		return s;
	}

	private static int sSDigit(int i) {

		int sSD = (int) (i / Math.pow(10, (digitCount(i)-2)));
		sSD = sSD%10;

		return sSD;
	}

	private static int mSDigit(int i) {
		int mSD = (int) (i / Math.pow(10, (digitCount(i)-1)));

		return mSD;
	}

	private static int digitCount(int num) {
		int count = 0;

		if (num == 0) {
			count = 1;
			return count;
		}

		while(num>0) {
			count++;
			num = num/10;
		}
		return count;
	}

	private static void swap(int i, int j, int[] unsortedArray) {

		int temp = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = temp;
	}

}
