package recursion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(reverse(s, 0, 0));
	}

	private static String reverse(String s, int startIndex, int endIndex) {
		if (startIndex==s.length()-1) {
			return "";
		}
//		Finding the endIndex
		while (endIndex <=s.length()-1 && s.charAt(endIndex) != ' ') {
			endIndex++;

		}
//		declaring a word as an empty string
		String word = "";
		if(endIndex==s.length()) {
			for (int i = startIndex; i < endIndex; i++) {
				word+=s.charAt(i);
			}
			return word;
		}
//		concatinating the formed word with the reversed string;
		for (int i = startIndex; i < endIndex; i++) {
			word+=s.charAt(i);
		}
		
//		Handling the corner case.
		

		if(word.isEmpty())
		{
			return "";
		}
		startIndex = endIndex +1;
		endIndex++;

		return reverse(s, startIndex, endIndex) + " " + word;
	}

}
