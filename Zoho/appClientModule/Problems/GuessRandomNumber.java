package Problems;

import java.util.*;

/* Guess Random Number*/

public class GuessRandomNumber {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 100);
		System.out.println(x);
		guessRanNum(x);
	}

	private static void guessRanNum(int n) {
		
		System.out.println("please guess the num");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while (n != x) {
			if (x>n) {
				System.out.println("Too high, try again.");
			}
			else {
				System.out.println("Too small, try again.");
			}
			x = scan.nextInt();
			
		}
		System.out.println("you are right!!!");
		
		
	}

}
