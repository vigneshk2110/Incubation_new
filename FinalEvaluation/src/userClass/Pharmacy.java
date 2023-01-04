package userClass;

import java.util.Scanner;

public class Pharmacy {

	public Pharmacy() {
	}

	public void login() {
		System.out.println("Please enter the email");
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		try {
			while(!(Hospital.validateEmail(email, "Pharmacist"))) {
				System.out.println("Please Enter Right email");
				email = scan.next();
			}
			System.out.println("Please enter your Password");
			String passWord = scan.next();

			while (!(Hospital.validateUser(email,passWord))) {
				System.out.println("Please Enter RIGHT Password");
				passWord = scan.next();
			}

			pharmacyMenu();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void pharmacyMenu() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. Dispatch Medicines"
					);
			option = sc.nextInt();

			if (option == 1) {
				Hospital.disPatchMedicine();
			}

			else {
				flag = false;
			}
		}

	}

}

