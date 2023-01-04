package methods;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		//		Scanner scan = new Scanner(System.in);
		//		System.out.println("please enter the Investment Amount");
		//		int capital = scan.nextInt();
		//		System.out.println("please enter the Rate of Interest");
		//		int roI = scan.nextInt();
		//		System.out.println("please enter the no of years");
		//		int term = scan.nextInt();

		double capital = 1000;
		double roI = 10;
		double term = 5;

		futureValue(capital,roI,term);

	}

	private static void futureValue(double capital, double roI, double term) {
		
		for (int i = 1; i <=term; i++) {
			double interest = Math.pow((1+(roI/1200)), 12*i);
			double answer = interest*capital;
			System.out.println(i + "---->" + answer);
		}
		
	}

}
