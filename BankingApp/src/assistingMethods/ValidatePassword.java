package assistingMethods;

import java.util.Scanner;

public class ValidatePassword {

	public static void main1(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String acPwd1  = sc.next();

			String pattern = "^(?=.*?[0-9]{2,})(?=.*?[a-z]{2,})(?=.*?[A-Z]{2,})(?=\\S+$){6,}$";
			if (acPwd1.matches(pattern)) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
	}

	public static void main(String[] args) {

		int count = 0;

		try (Scanner sc = new Scanner(System.in)) {
			String password  = sc.next();
			
			String pattern = "(?=.*\\d{2,})", pattern1 = "(?=.*[a-z]{2,})", 
					pattern2 = "(?=.*[A-Z]{2,})", pattern3 = "(?=\\S+$)", pattern4 = ".{6, 20}";
			if (password.matches(pattern) && password.matches(pattern1) && password.matches(pattern2) &&
					password.matches(pattern3) && password.matches(pattern4)  ) {
				count = 1;
			}
		}
		
		if (count == 1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
}
