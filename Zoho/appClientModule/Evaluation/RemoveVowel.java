package Evaluation;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {


				Scanner scan = new Scanner(System.in);
				System.out.println("Please Input a String");
				
				String s = scan.next();

//		String s = "Compuuter";

		String result = vowelRemove(s);
		
		System.out.println(result);

	}

	private static String vowelRemove(String s) {
		
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (!isVowel(s.charAt(i))) {
				res = res + s.charAt(i);
			}
			else if(isVowel(s.charAt(i)) &&  i<=s.length()-1 && isVowel(s.charAt(i+1))) {
				res = res + s.charAt(i) +s.charAt(i+1) ;
				i = i+1;
			}
			else if(!isVowel(s.charAt(i)) && i==s.length()-1) {
				res = res + s.charAt(i);
			}
			else {
				res = res + s.charAt(i+1);
				i = i+2;
			}
		}
		return res;
	}


	private static boolean isVowel(char c) {

		if (c == 'a' || c== 'e' || c == 'i' || c== 'o' || c == 'u'  || c == 'A' || c== 'E' || c == 'I' || c== 'O' || c == 'U') {
			return true;
		}
		return false;
	}

}
