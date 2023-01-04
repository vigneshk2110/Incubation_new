package Docu3;

import java.util.Scanner;

// Twisted Prime Number

public class TwistedPrime {

	public static void main(String[] args) {
//		int n = 97;
//		isTwistedPrime(n);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a prime number");


		int	s1 = scan.nextInt();
		if(isPrime(s1)) {
			isTwistedPrime(s1);
		}
		else {
			System.out.println("Please enter a prime number, " + s1 + " is not a prime");
			s1 = scan.nextInt();
			isTwistedPrime(s1);
		}
	}

	private static void isTwistedPrime(int n) {
		int reverse = 0;

		while(n!=0) {
			int digit = n%10;
			reverse = reverse*10 + digit;
			n = n/10;
		}
		boolean result = isPrime(reverse);

		if(result == true) {
			System.out.println("Both the number and its reverse are prime" );
		}
		else {
			System.out.println("the reverse of the number is not a prime" );
		}


	}

	private static boolean isPrime(int reverse) {
		for(int i = 2; i<reverse/2; i++) {
			if(reverse%i == 0) {
				return false;
			}
		}
		return true;		
	}

}
