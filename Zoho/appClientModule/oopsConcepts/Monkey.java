package oopsConcepts;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of trees");
		int treesNum = scan.nextInt();
		
		if (treesNum<0) {
			System.out.println("No of Trees can't be negative, please enter a +ve number");
			treesNum = scan.nextInt();
		}
		System.out.println("please enter heights of each tree");
		int [] array = new int[treesNum] ;

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();
		}
		
		System.out.println(longestDistance(array));
		
	}

	private static int longestDistance(int[] array) {
		
		int maxDiff = Integer.MIN_VALUE;
		int tree1 = 0 , tree2 = 0;
		
		
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				int num2Add = Math.abs(i-j);
				if (num2Add>(array.length/2)) {
					num2Add = Math.abs(i-j)%(array.length/2);
				}
				
				if ((array[i] + array[j] + num2Add) >= maxDiff) {
					maxDiff = array[i] + array[j] + num2Add;
					tree1 = i+1;
					tree2 = j+1;
				}
			}
		}
		
		System.out.println("Tree's with max distance are " + tree1 + "&" + tree2 );
		return maxDiff;
	}

}
