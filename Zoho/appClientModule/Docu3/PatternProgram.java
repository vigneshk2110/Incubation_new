package Docu3;

public class PatternProgram {

//	printPattern - PROGRAM
	
	public static void main(String[] args) {
		String s = "PROGRAM";

		pattern(s);
	}

	private static void pattern(String s) {
		char [] str = s.toCharArray();
		int n = str.length;

		int rows = 0;

		while(rows<n) {
			int spaces = rows;
			while(spaces<n-1) {
				System.out.print("  ");
				spaces++;
			}

			int i = 0;
			while(i<=rows) {
				System.out.print(s.charAt(n/2 + i));
				i++;
				if(n/2+i >= n) {
					break;
				}
			}

			if((n/2) % 2 == 0) {

				if(i>=(n/2) && rows>=n/2) {
					i = 0;
					while(i<=(rows%((n+1)/2))) {
						System.out.print(s.charAt(i));
						i++;
					}
				}
			}

			if((n/2) % 2 == 1) {

				if(i>=(n/2) && rows>n/2) {
					i = 0;
					while(i<=(rows%((n+1)/2))) {
						System.out.print(s.charAt(i));
						i++;
					}
				}
			}


			System.out.println();
			rows++;
		}

	}
}

/*
 *          G
          GR
        GRA
      GRAM
    GRAMP
  GRAMPR
GRAMPRO
 */


