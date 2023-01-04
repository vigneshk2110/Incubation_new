package recursion;

public class PatternStar {

	public static void main(String[] args) {
		starPattern1(4);
		
		starPattern2(5);

	}

	private static void starPattern2(int row) {
		if (row == 0) {
			return;
		}
		
		starPattern2(row-1);
		print(row, 0);
	}

	private static void starPattern1(int row) {
		if (row == 0) {
			return;
		}
		print(row,0);
		
		starPattern1(row-1);
		return;
	}

	private static void print(int row, int col) {
		while (col<row) {
			System.out.print("* ");
			col++;
		}
		System.out.println();
		
		return;
	}

}
