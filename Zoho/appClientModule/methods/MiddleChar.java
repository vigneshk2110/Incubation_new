package methods;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the String to find the mid character");
		String s = scan.next();
		
//		String s = "vigesh";
		
		midChar(s);

	}

	private static void midChar(String s) {
		if (s.length()%2 == 0 ){
			System.out.println(s.charAt((s.length()/2) -1));
			System.out.println(s.charAt(s.length()/2));
			return;
		}
		System.out.println(s.charAt(s.length()/2));
	}

}
