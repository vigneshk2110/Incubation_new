package Problems;

import java.util.Scanner;

/*rotating string */
public class RotateString {

	public static void main(String[] args) {
		String s1 = "amazon";
		String s2 = "azonam";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter a word to find if it matches a word if rotated left twice");
		s1 = scan.next();
		
		System.out.println("please enter a word to check with");
		s2 = scan.next();
		

				
		rotateTwice(s1,s2);
		
//		s1 = "geek sfor geeks";
//		
//		s2 = "geeksgeeksfor";
//		
//		rotateTwice(s1, s2);

	}

	private static void rotateTwice(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] strArr = s1.toCharArray();
		
		for (int j = 1; j <= 2; j++) {
			char temp = strArr[0];
			for (int i = 0; i < strArr.length-1; i++) {
				strArr[i] = strArr[i+1];
			}
			strArr[strArr.length-1] = temp;
		}
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != s2.charAt(i)) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}

}
