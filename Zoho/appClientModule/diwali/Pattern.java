package diwali;

public class Pattern {

	public static void main(String[] args) {
		pattern(4);
	}

	private static void pattern(int n) {
		
		int i = 0;
		
		while (i<n/2) {
			int j = i , print = n;
			while (j<n/2) {
				System.out.print(print-j);
				j++;
			}
			i++;
			System.out.println();
		}
		
		
	}

}
