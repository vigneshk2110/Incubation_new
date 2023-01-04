package methods;

import java.util.Scanner;

public class SmallOf3 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the 1st Num");
		int x1 = scan.nextInt();
		System.out.println("please enter the 2nd Num");
		int x2 = scan.nextInt();
		System.out.println("please enter the 3rd Num");
		int x3 = scan.nextInt();
		
//		int x1 = 25, x2 = 37, x3 = 29;
		int min = minOf3(x1, x2, x3);
		
		System.out.println(min);
		

	}

	public static int minOf3(int x1, int x2, int x3) {
		
		if (x1<x2 && x1<x3) {
			return x1;
		}
		else if (x2<x1 && x2<x3) {
			return x2;
		}
		
		return x3;
	}

}
