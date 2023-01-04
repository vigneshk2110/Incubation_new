package Doc4;

public class largeNum {

	public static void main(String[] args) {

		int[] nums = {30,3,305,34,30,20,5,9,35, 30,4};

		String[] numsStrings = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {
			numsStrings[i] = Integer.toString(nums[i]);
		}

		System.out.println(largeNumString(numsStrings));
		
	}

	private static String largeNumString(String[] numsStrings) {

		for (int i = 0; i < numsStrings.length; i++) {
			for (int j = i+1; j < numsStrings.length; j++) {
				String s1 = numsStrings[i] + numsStrings[j];
				String s2 = numsStrings[j] + numsStrings[i];

				if (Long.parseLong(s1) < Long.parseLong(s2)) {
					swapNums(i,j,numsStrings);
				}
			}
		}

		String largeNum = "";

		for (int i = 0; i < numsStrings.length; i++) {
			largeNum = largeNum+numsStrings[i];
		}
		
		return largeNum;

	}

	private static void swapNums(int i, int j, String[] numsStrings) {

		String temp = numsStrings[i];
		numsStrings[i] = numsStrings[j];
		numsStrings[j] = temp;

	}
}
