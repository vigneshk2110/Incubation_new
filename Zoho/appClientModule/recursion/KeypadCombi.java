package recursion;


public class KeypadCombi {

	static String[] keypad = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public static void main(String[] args) {

		combi(789);

	}

	private static void combi(int n) {

		int [] nums = new int [digitCount(n)];
		int i = nums.length;
		while (n>0) {
			nums[--i] = (n%10) -2;
			n = n/10;
		}

		//		System.out.println(Arrays.toString(nums));

		int count = 1;

		for (int i1 = 0; i1 < nums.length; i1++) {
			count *=  keypad[nums[i1]].length();
		}

		String[] answer = new String [count];

		//		System.out.println(answer.length);


		for (int j = 0; j < answer.length; j++) {
			answer[j] = "";
		}
		for (int k : nums) {
			String s = keypad[k];
			
			
			
			


		}
	}

	private static boolean notPresent(char ch, String s) {
		char[] str = s.toCharArray();

		for (char c : str) {
			if (c == ch) {
				return true;
			}
		}

		return false;
	}

	private static int digitCount(int num) {
		int count = 0;

		if (num == 0) {
			count = 1;
			System.out.println(count);
			return 1;
		}

		while(num>0) {
			count++;
			num = num/10;
		}
		//		System.out.println(count);
		return count;
	}

}
