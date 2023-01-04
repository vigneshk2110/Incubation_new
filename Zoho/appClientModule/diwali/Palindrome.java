package diwali;

public class Palindrome {

	public static void main(String[] args) {
//		String s = "barathtarahb";
		
		String s = "aacecaaa";
		
//		String s = "abcd";
		
		System.out.println(palindrome(s));
	}

	private static String palindrome(String s) {
		
		char [] str = s.toCharArray();
		StringBuilder resultString = new StringBuilder();
		
		int i = 0, j = str.length-1;
	
		while (i<j) {
			if (str[i] == str[j]) {
				resultString.append(str[i]);
				i++;
				j--;
			}
			else if (str[i] != str[j]) {
				resultString.append(str[j]);
				j--;
			}
		}
		resultString.append(str[j]);
		
		int summaLength = resultString.length()-2;
		
		for (int k = summaLength; k > -1; k--) {
			resultString.append(resultString.charAt(k));
		}
		
		
		return resultString.toString();
	}

}

/*
 * You are given a string s. You can convert s to a palindrome by
adding characters in front of it.
Return the shortest palindrome you can find by performing this
transformation.
Input: s = "aacecaaa"
Output: "aaacecaaa"
*/
