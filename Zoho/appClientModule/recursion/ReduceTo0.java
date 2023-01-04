package recursion;

public class ReduceTo0 {

	public static void main(String[] args) {
		System.out.println(cutDowntoZero(10));
		
		System.out.println(cutDowntoZero(41));

	}

	private static int cutDowntoZero(int n) {
		return helper(n,0);
	}

	private static int helper(int n, int count) {
		if (n == 0) {
			return count;
		}
		if (n%2 == 1) {
			return	helper(n-1, count+1) ;
		}
		else {
			return	helper(n/2, count+1) ;
		}
	}
}
