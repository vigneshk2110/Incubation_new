package methods;

public class TwinPrime {

	public static void main(String[] args) {
		twinPrimeNum(100);

	}
	

	private static void twinPrimeNum(int n) {
		
		for (int j = 2; j <= n; j++) {
			if (j>3 && isPrime(j-2) && isPrime(j) ) {
				System.out.println("(" + (j-2) + "," + j +")");
			}
		}
		
		
	}
	
	private static boolean isPrime(int n) {
		for (int j = 2; j <= n/2; j++) {
			if (n%j == 0) {
				return false;
			}
		}
		return true;
	}
}
