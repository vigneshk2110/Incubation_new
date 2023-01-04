package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String to find if palindromic string can be formed");
		String str = scan.next();

		System.out.println(formsPalindrome(str));
	}



	private static boolean formsPalindrome(String str) {
		
		ArrayList<String> array = new ArrayList<>();

		str = str.toLowerCase();

		String newWordString = "";
		System.out.println(newWordString.length());

		char [] strArray = new char[str.length()];

		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = str.charAt(i);
		}
		
			for (int i = 0; i < strArray.length; i++) {
				for (int j = strArray.length-1; j > i ; j-- ) {
					String sub = str.substring(i, j);
					if (isPalindromeString(sub)) {
						array.add(sub);
						if (newWordString.length() < sub.length()) {
							newWordString = sub;
						}
					}
				}
			}			
			
			
		String [] palindromeArray = new String[array.size()];

		if (newWordString.length() == 0) {
//			System.out.println(newWordString + "---- inside if");
			return false;
		}
		else {
			System.out.println(newWordString + " <---- result");
			return true;
		}

	}


	private static boolean isPalindromeString(String str) {
		
		if (str.length()<=1) {
			return false;
		}

		str = str.toLowerCase();

		int start = 0;
		int end = str.length()-1;

		while (start<end) {
			if (str.charAt(start) != str.charAt(end) ) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
