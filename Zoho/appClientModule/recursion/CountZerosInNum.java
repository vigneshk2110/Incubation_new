package recursion;

public class CountZerosInNum {
	static int count =0;
	 
	public static void main(String[] args) {
		System.out.println(zeroCount(12000040));
	}

	private static int zeroCount(int n) {

		if (n%10 == n){
			return count;
		}
		
		if (n%10 == 0) {
			count++;
		}
		
		return zeroCount(n/10);
	}
	
}
