package zCoins;

import java.util.Scanner;

public class ZEmployee implements ZuInterface{

	protected static void adminMenu() {
		
		System.out.println("Great!!!Logged into Admin Portal");
		
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		ZEmployee ze1 = new ZEmployee();
		
		do {
			System.out.println("Please select any option.\n1.Approve User Account \n2.Fetch Transaction");
			option = scan.nextInt();
			switch (option) {
						
			case 1:
				ze1.approveUsers();
				break;
				
			case 2:
				ze1.viewTransactions();
				break;

			}
			
		} while (option > 0 && option < 3);
		
		
	}

	
	public void approveUsers() {
//		DBConnect.approveUsers();
		
		
	}

	public void viewTransactions() {
		System.out.println("Transactions");
	}

	public void allocateZID() {
		System.out.println("Allocate");
	}
	
	

}
