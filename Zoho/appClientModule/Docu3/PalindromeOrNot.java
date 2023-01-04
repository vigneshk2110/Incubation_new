package Docu3;

import java.util.*;

public class PalindromeOrNot {
	
//	ﬁnd if it is Palindrome or Not.. 

	public static void main(String[] args) {
//		String s = "RACE CAR" ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String	s = scan.nextLine();
		
		boolean result = isPalindrome(s);
		System.out.println(result);


	}

	private static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int startIndex = 0;
		int endIndex = s.length()-1 ;

		while(startIndex<endIndex) {
			while((s.charAt(startIndex) < 'a' || s.charAt(startIndex)> 'z') && (s.charAt(startIndex) < '0' || s.charAt(startIndex) > '9') ){
				startIndex++;
			}
			while((s.charAt(startIndex) < 'a' || s.charAt(startIndex)> 'z') && (s.charAt(startIndex) < '0' || s.charAt(startIndex) > '9') ) {
				endIndex--;
			}
			if(s.charAt(startIndex) != s.charAt(endIndex)) {
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}
}
