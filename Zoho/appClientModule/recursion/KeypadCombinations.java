package recursion;

import java.util.Scanner;

public class KeypadCombinations {
	
	static String [] alphaNums = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		keypad(num);

	}

	private static void keypad(int num) {
		if (num == 0 || num == 1) {
			System.out.println("");
			return;
		}
		
		keypad(num/10);
		
	}
	
	
	

}
