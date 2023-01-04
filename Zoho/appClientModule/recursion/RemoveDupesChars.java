package recursion;

import java.util.Scanner;

public class RemoveDupesChars {
	static String s = "aabba";
	public static void main(String[] args) {

		String t = "";
		//		System.out.println(dupesRemove(0, t));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String	s1 = scan.nextLine();

		System.out.println(removeConsecutiveDuplicates(s1));
		System.out.println("Next Method - " +  s1);
		System.out.println(dupesRecursionRemove(s1));

	}
	private static String dupesRecursionRemove(String s2) {
		if (s2.length() <= 1) {
			return s2;
		}

		if (s2.charAt(0) == s2.charAt(1)) {
			return dupesRecursionRemove(s2.substring(1));
		}
		else {
			return s2.charAt(0) +dupesRecursionRemove(s2.substring(1));
		}

	}

	public static String removeConsecutiveDuplicates(String input)
	{
		if (input.length() <= 1)
			return input;
		if (input.charAt(0) == input.charAt(1))
			return removeConsecutiveDuplicates(
					input.substring(1));
		else
			return input.charAt(0)
					+ removeConsecutiveDuplicates(
							input.substring(1));
	}
	private static String dupesRemove(int index, String t) {
		if (index == s.length()) {
			return t;
		}
		t+=s.charAt(index);

		if (s.charAt(index) == s.charAt(index+1)) {
			index += 1;
		}
		return dupesRemove(index+1, t);
	}



}
