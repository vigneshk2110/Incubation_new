package Problems;

import java.util.*;

/*swap two variables*/

public class Swap {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("please enter num 1");
		int numOne = s.nextInt();
		System.out.println("please enter num 2");
		int numTwo = s.nextInt();

		swapNums(numOne, numTwo);
	}

	private static void swapNums(int numOne, int numTwo) {
	
		System.out.println("Before Swap");
		
		System.out.println("num1 = " + numOne);
		System.out.println("num2 = " + numTwo);

		int temp = numOne;
		numOne = numTwo;
		numTwo = temp;

		System.out.println("After Swap");

		System.out.println("num1 = " + numOne);
		System.out.println("num2 = " + numTwo);
	}

}
