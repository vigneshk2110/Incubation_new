package Docu3;

import java.util.Arrays;

public class Pattern123 {
	
//	printPattern - 12345678910

	public static void main(String[] cmd) {
		
		pattern(5);
	}

	private static void pattern(int n) {
		//		 above n-1
		int rows = 1;

		//		WhiteSpaces 
		while(rows<n) {
			int spaces = rows;
			while(spaces<n-1) {
				System.out.print(" ");
				spaces++;
			}
			//	 Numerals	
			int startNum = (rows*(rows+1))/2;
			int i = 0;

			while(i<rows) {
				System.out.print(startNum-- + " ");
				i++;
			}
			System.out.println();
			rows++;
		}
		//		 below n-1

		rows = n;

		while(rows<=2*n-2) {

			// whiteSPaces
			
			int spaces = rows;
			while(spaces>n) {
				System.out.print(" ");
				spaces--;
			}
//			 Numerals	
			int num = 2*n - rows-1;			
			int startNum = (num*(num+1))/2;
			int i = 0;

			while(i<num) {
				System.out.print(startNum-- + " ");
				i++;
			}

			System.out.println();
			rows++;
		}
	}
}


