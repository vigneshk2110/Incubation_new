package diwali;

import java.util.Scanner;
import java.util.Stack;

public class MinPopStack {

	public static void main(String[] args) {
//		int []a = {1,2,3,4,5};
		
//		int []a = {1,6,43,1,2,0,5};
		
//		int []a = {6,5,4,3,2,1};
		
		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] a = new int[size] ;

		System.out.println("please enter value for each index ");
		
		for (int i = 0; i < a.length; i++) {
			
			int index = scan.nextInt();

			a[i] = index;
		}


		
		minStackPop(a);
	}

	private static void minStackPop(int[] a) {
		
		Stack<Integer> trail = new Stack<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			trail.push(a[i]);
		}
		
		while (!trail.empty()) {
			int min = Integer.MAX_VALUE;
			
			for (Integer integer : trail) {
				if (min>integer) {
					min = integer;
				}
			}
			
			System.out.print(min + " is the minimum in the stack : Popped ");
			System.out.println(trail.pop());
		}
		
	}

}
