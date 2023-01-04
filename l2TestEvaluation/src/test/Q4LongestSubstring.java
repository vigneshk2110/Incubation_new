package test;

import java.util.Scanner;

public class Q4LongestSubstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String to find the length of longest Substring Without Rep of any character");
		String str = scan.next();
		System.out.println(longestSubstringWithoutRep(str));
	}

	

	private static String longestSubstringWithoutRep(String str) {
		
		int startIndex = 0;
		int endIndex = str.length();
		
		String longestString = "";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length()-1; j > i ; j-- ) {
				String sub = str.substring(i, j+1);
				if (isWithoutRep(sub)) {
					if (longestString.length() < sub.length()) {
						longestString = sub;
					}
				}
			}
		}
		
		return longestString;
	}
	
	private static boolean isWithoutRep(String str) {
		
		str=str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
		
		
	}
}
