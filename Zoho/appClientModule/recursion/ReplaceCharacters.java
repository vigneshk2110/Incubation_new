package recursion;

import java.util.Scanner;

public class ReplaceCharacters {
	
	static String s = "";
	static String result = "";
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		s = scan.nextLine();
		
		System.out.println("Enter the characters one by one");
		char c1 = scan.next().charAt(0);
		char c2 = scan.next().charAt(0);
		
//		System.out.println(charReplace(c1, c2,0));
		
		System.out.println(replace(s,c1,c2));
		
	}

	private static String replace(String s2, char c1, char c2) {
		if (s2.length() == 0) {
			return s2;
		}
		
		String output = replace(s2.substring(1), c1, c2);
		if (s2.charAt(0) == c1) {
			return c2+output;
		}
		else {
			return s2.charAt(0)+output;
		}
	}

	private static String charReplace(char c1, char c2, int index) {
		
		if (index == s.length()) {
			return result;
		}
		
		if (s.charAt(index) == c1) {
			result+=c2;
		}
		else {
			result+=s.charAt(index);
		}
		
		return charReplace(c1, c2, index+1);
	}
}
/*
Replace Characters Recursively
Send Feedback
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd

*/