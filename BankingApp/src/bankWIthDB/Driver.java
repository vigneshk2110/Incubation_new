package bankWIthDB;

import java.sql.SQLException;
import java.util.Scanner;

public class Driver extends DBuser{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {

		DBuser.setupBank();

		System.out.println("Welcome to the CRM Bank");
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean flag = true;
		while (flag) {

			System.out.println("Please select the desired option "
					+ "\n1. Banker "
					+ "\n2. Customer");
			option = sc.nextInt();

			if (option == 1 ) {
				try {
					if(Bank.adminLogin()) {
						Bank.bankerUI();
					}
					else {
						System.out.println("Please enter the Right Credentials");
						Driver.main(args);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			else if (option == 2) {
				int cus = Customer.customerLogin();
				if (cus!=0) {
					System.out.println("Successfully, Logged into your Portal...");
					Customer.customerUI(cus);
				}
				else {
					System.out.println("Please enter the Right Credentials");
				}

			}
			else {
				System.out.println("Thanks, Visit Again");
				flag = false;
			}

		}


	}



}
