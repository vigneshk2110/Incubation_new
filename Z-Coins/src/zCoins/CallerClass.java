package zCoins;

import java.sql.SQLException;
import java.util.Scanner;

public class CallerClass {
	
	static {
		try {
			DBConnect.setUpDB();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("\n---------------Welcome---------------");
		Scanner scan = new Scanner(System.in);
		int option =0;
		
		do {
			System.out.println("\nSelect anyone option from below.\n"
					+ "\n1.ZE-Admin"
					+ "\n2.ZE-User");
			option = scan.nextInt();
			switch (option) {
			case 1:
				adminLogin();
				break;
				
			case 2:
				userLogin();
				break;
			}
			
		} while (option > 0 && option < 3);
	}

	private static void userLogin() {
		ZEUser.userMenu();	
	}

	private static void adminLogin() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter your UserName");
		String adminUname = scan.next();
		while (!adminUname.equals("admin@ze.com")) {
			System.out.println("Please Enter RIGHT UserName");
			adminUname = scan.next();
		}
		
		System.out.println("Please Enter your Password");
		String adminpass = scan.next();
		
		while (!adminpass.equals("admin")) {
			System.out.println("Please Enter RIGHT Password");
			adminpass = scan.next();
		}
		
		ZEmployee.adminMenu();
		
	}

}
