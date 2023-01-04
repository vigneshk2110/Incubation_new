package diwali;

import java.util.Scanner;

public class SimiliareArrays {

	public static void main(String[] args) {
//	String [] word1 = {"ab", "c"}, word2 = {"a", "bc"};
	
//	String [] word1 = {"abc", "d", "defg"}, word2 = {"abcddefg"};
	
//	String [] word1 = {"a", "cb"}, word2 = {"ab", "c"};
		
		Scanner scan = new Scanner(System.in);
	
	System.out.println("please enter the size of the String Array");

	int size = scan.nextInt();
	if (size<0) {
		System.out.println("Size can't be negative, please enter a +ve number");
		size = scan.nextInt();
	}
	String [] word1 = new String[size] ;

	for (int i = 0; i < word1.length; i++) {
		System.out.println("please enter String for index " +i);
		String index = scan.next();

		word1[i] = index;
	}
	
	System.out.println("please enter the size of the String Array");

	int size1 = scan.nextInt();
	if (size1<0) {
		System.out.println("Size can't be negative, please enter a +ve number");
		size1 = scan.nextInt();
	}
	String [] word2 = new String[size1] ;

	for (int i = 0; i < word2.length; i++) {
		System.out.println("please enter String for index " +i);
		String index = scan.next();

		word2[i] = index;
	}
	
	System.out.println(similiarOrNot(word2, word2));

	}

	private static boolean similiarOrNot(String[] word1, String[] word2) {
		
		String s1 = "", s2 = "";
		
		for (int i = 0; i < word1.length; i++) {
			s1+=word1[i];
		}
		
		for (int i = 0; i < word2.length; i++) {
			s2+=word2[i];
		}
		
		if (s1.equals(s2)) {
			return true;
		}
		
		return false;
		
	}


}
