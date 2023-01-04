package recursion;

public class PrintNto1ByBackTracking {

	public static void main(String[] args) {
		nto1PrintBacktracking(6);

	}

	private static void nto1PrintBacktracking(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		nto1PrintBacktracking(n-1);
	}

}
