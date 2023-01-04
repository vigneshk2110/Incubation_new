package zCoins;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZEUser implements UserInterface{

	private String name;
	private long mobNum;
	private int HID;
	private String userEmail;
	private String userPassword;
	private double realCurrency;
	private double zCoins;
	private int zID;	

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


	protected static void userMenu() {
		System.out.println("Welcome to the User Portal");


		Scanner scan = new Scanner(System.in);
		int option = 0;

		ZEUser user1 = new ZEUser();

		do {
			System.out.println("Please select any option.\n1.Login \n2.Register User.");
			option = scan.nextInt();
			switch (option) {

			case 1:
				user1.userLogin();
				break;

			case 2:
				user1.registerUser();
				break;

			}

		} while (option > 0 && option < 3);

	}


	public void userLogin() {
		System.out.println("Inside Login Method");

	}

	@Override
	public void registerUser()  {
		System.out.println("Welcome to the Z Universe");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Name");
		String name = scan.nextLine();
		System.out.println("Please enter your Mobile Number");
		long mobNum= scan.nextLong();
		System.out.println("Please enter your HID");
		int hID= scan.nextInt();
		System.out.println("Please enter your Email");
		String email = scan.next();

		while (!validateEmail(email)) {
			System.out.println("Please enter RIGHT Email");
			email = scan.next();
		}

		System.out.println("Please enter your Password");
		String pass = scan.next();

		while (!validatePassword(pass)) {
			System.out.println("Please enter RIGHT Password");
			pass = scan.next();
		}

		System.out.println("Please enter your Initial Deposit in RC");
		double realCurrency = scan.nextDouble();

		try {
			DBConnect.addUser(name,mobNum, hID,email,pass, realCurrency);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Your Account has been Created & submitted for Admin's Approval. \nPlease Login after SomeTime");
		
	}

	@Override
	public void viewTransaction() {
		System.out.println("Inside Transactions");

	}









	@Override
	public void deposit() {
		System.out.println("Inside Deposit");

	}









	@Override
	public void withdraw() {
		System.out.println("Inside Withdraw");

	}









	@Override
	public void convertCurrency() {
		System.out.println("Inside ConvertCurrency");

	}









	@Override
	public void transferZcoins() {
		System.out.println("Inside Transfer");

	}









	@Override
	public void passWordChange() {
		System.out.println("Inside PasswordChange");

	}










	protected static boolean validatePassword(String pass) {

		if (pass.length()<8) {
			return false;
		}

		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#%?<>&*])(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(pass);
		return matcher.find();
		
		
	}

	public static boolean validateEmail(String emailStr) {
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(emailStr);
		return matcher.matches();
	}





}
