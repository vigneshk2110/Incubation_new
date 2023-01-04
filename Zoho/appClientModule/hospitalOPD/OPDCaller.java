package hospitalOPD;

import java.util.Scanner;

public class OPDCaller {

	public static void main(String[]args) {

		System.out.println("	!!! Welcome !!!\n");
		login();
	}
	
	static void login() {
		
		boolean res = true;

		do {
			System.out.println("Entered the desired Option. "
					+ "\n1. Register "
					+ "\n2. View Status "
					+ "\n3. Exit");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();

			switch (a) {
			case 1:
				Register.initialOperation();
				break;
			case 2:
				try {
					Register.display();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				res = false;
				break;
			}
		} while (res);
		
	}
}
