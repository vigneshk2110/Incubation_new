package methods;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the String to find the no of vowels");
		String s = scan.next();
		

		
		int count = vowelCount(s);
		System.out.println(count);

	}

	private static int vowelCount(String s) {
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
	
	private static boolean isVowel(char c) {

		if (c == 'a' || c== 'e' || c == 'i' || c== 'o' || c == 'u'  || c == 'A' || c== 'E' || c == 'I' || c== 'O' || c == 'U') {
			return true;
		}
		return false;
	}

}
