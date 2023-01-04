package recursion;

public class Fibo {
	
	static int [] arr = new int [1000];
	
	public static void main(String[] args) {

//		System.out.println(fibo(15));
		
		for (int i = 1; i <= 15; i++) {
			System.out.println(fibo(i)  + " ---->" + i );
		}
//		System.out.println(fibo(10));
	}

	private static int fibo(int n) {

		if (n == 1) {
			arr[n-1] = 0;
			return 0;
		}
		
		if (n == 2) {
			arr[n-1] = 1;
			return 1;
		}
		
		if (arr[n-1] == 0) {
			arr[n-1] = fibo(n-1) +fibo(n-2) ;
			return arr[n-1];
		}
		else {
			return arr[n-1];
		}
	}
}
