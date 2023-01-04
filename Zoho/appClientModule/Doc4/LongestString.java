package Doc4;

import java.util.Arrays;

public class LongestString {

	public static void main(String [] args) {

		String s = "aacabb"; 
		int k = 2;

		System.out.println(longSubString(s,k));
	}

	private static int longSubString(String s, int k) {

		if (k <= 1 || k>s.length()) {
			return s.length();
		}

		int [] freq = new int [26];

		for (int i = 0; i < s.length(); i++) {

			freq[s.charAt(i) - 'a']++;

		}

		int startIndex = 0;
		int endIndex = s.length()-1;

		for (int i = 0; i < s.length(); i++) {
			
			for (int j = s.length()-1; j >i; j--) {
			
				if (freq[s.charAt(i) - 'a'] < k) {
					startIndex = i+1;
				}
				if (freq[s.charAt(j) - 'a'] < k) {
					endIndex= j-1;
				}
			}
		}
		
		String s1 =  returnWord(startIndex, endIndex, s);
		
		System.out.println(s1);

		return s1.length();
	}

	private static String returnWord(int startIndex, int endIndex, String s1) {
		String s = "";

		while(startIndex<=endIndex) {
			s = s + s1.charAt(startIndex);
			startIndex++;
		}
		return s;
	}

}
