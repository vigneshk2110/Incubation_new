package recursion;

public class NthPower2 {

	public static void main(String[] args) {

		System.out.println(power2toN(10));

	}

	private static int power2toN(int n) {

		if (n == 1) {
			return 2;
		}
		return 2*power2toN(n-1);
	}
}
