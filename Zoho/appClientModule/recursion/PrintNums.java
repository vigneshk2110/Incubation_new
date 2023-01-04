package recursion;

public class PrintNums {

	public static void main(String[] args) {
//		print(5);
		reversePrint(5);	
	}

	private static void print(int n) {
		if (n==0) {
			return;
		}
		
		print(n-1);
		System.out.println(n);
		
	}

	private static void reversePrint(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		reversePrint(n-1);
	}
}
