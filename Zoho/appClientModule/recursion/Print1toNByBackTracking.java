package recursion;

public class Print1toNByBackTracking {
	
	public static void main(String[] args) {
		
		backTrackPrint(5);

	}

	private static void backTrackPrint(int n) {
		
		if (n == 0) {
			return;
		}
		
		
		backTrackPrint(n-1);
		System.out.println(n);
		
	}
}
