package methods;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the String to find the no of words");
		String s = scan.nextLine();
		
//		String s = "    The quick   brown   fox   jumps   over   the   lazy dog   ";
		
		int count = wordCount(s);
		
		System.out.println(count);

	}

	private static int wordCount(String s) {
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' &&  i!= 0 && Character.isAlphabetic(s.charAt(i-1))) {
				count++;
			}
			else if (i == s.length()-1  && Character.isAlphabetic(s.charAt(i-1))) {
				count++;
			}
		}
		
		return count;
	}

}
