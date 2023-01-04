package recursion;

public class Fibonacci {



	public static void main(String[] args) {
		int [] array = new int [14];
		fibo(14,array);
		for(int i:array)
		{
			System.out.println(i);
		}

	}

	private static int fibo(int n,int[] array) {

		if (n == 0 || n == 1) {

			return n ;
		}

		int SO1=0,SO2=0;

		SO1=fibo(n-1,array);
		array[n-1]=SO1;

		SO2=fibo(n-2,array);
		array[n-2]=SO2;

		SO2=array[n-2];
		int fib=SO1+SO2;
		return fib;
	}
}