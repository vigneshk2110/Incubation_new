package bankWIthDB;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DBuser extends DatabaseConnection {

	static {
		try {
			setupBank();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static DatabaseConnection dbc = new DatabaseConnection();

	protected static void setupBank() throws ClassNotFoundException, SQLException {
		connectDB();
		query="{call SETUPBANK()}"; // Setup Bank Accounts Using Call able Statements
		callSt = con.prepareCall(query);		
		callSt.execute();		
		closeDB();
	}

	public static void addCustomer() throws ClassNotFoundException, SQLException {
		
		int custID = dbc.getLastID() + 1;		
		int initialBal = 10000;		
		int accNum = dbc.getLastAccNum() + 11011;
		
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please enter the Name of the Account Holder");
		String accountHolderName  = sc.nextLine();

		System.out.println("Please enter the Password for your Account. "
				+ "\nPassword Should Consist 2 Block, 2 small Letters & 2 digits");
		String password  = sc.nextLine();
		while (!validatePassword(password)) {
			System.out.println("Please Enter password in RIGHT format");
			System.out.println("Password Should Consist 2 Block, 2 small Letters & 2 digits");
			password  = sc.nextLine();
		}
		password = passwordEncrypt(password);
		
		connectDB();
		query = "INSERT INTO customers.customerstable VALUES"
				+ " ("+custID +", "+accNum +", '"+accountHolderName +"',"+initialBal +",'"+password +"','-','-' );";
		st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Customer Added Successfully"
				+ "\nThe CustID is " + custID + 
				"\nThe Account Number is "+accNum);		
		
		
		query = "INSERT INTO customers.transactions VALUES"
				+ " ("+custID +", 1 , now(),'Account Created',10000, 10000 );";
		st = con.createStatement();
		st.executeUpdate(query);
		
		
		closeDB();
		
	}
	
	protected static String passwordEncrypt(String passWord) {

		String encryptedPass = "";

		for (int i = 0; i < passWord.length(); i++) {
			if (Character.isDigit(passWord.charAt(i))) {
				if (passWord.charAt(i) == '9') {
					encryptedPass+= '1';
				}
				else {
					encryptedPass+= (char)(passWord.charAt(i) +1);
				}
			}
			else if (Character.isLowerCase(passWord.charAt(i))) {
				if (passWord.charAt(i) == 'z') {
					encryptedPass+= 'a';
				}
				else {
					encryptedPass+= (char)(passWord.charAt(i) +1);
				}

			}
			else if (Character.isUpperCase(passWord.charAt(i))) {
				if (passWord.charAt(i) == 'Z') {
					encryptedPass+= 'A';
				}
				else {
					encryptedPass+= (char)(passWord.charAt(i) +1);
				}
			}

		}
		return encryptedPass;
	}
	
	protected static boolean validatePassword(String pass) {

		String pattern1="[a-z]";
		String pattern2="[A-Z]";
		String pattern3="[0-9]";
		int total=0;
		for(int i=1;i<=3;i++) {
			String pattern = null;
			switch(i) {
			case 1:
				pattern=pattern1;
				break;
			case 2:
				pattern=pattern2;
				break;
			case 3:
				pattern=pattern3;
				break;
			}
			Pattern p =Pattern.compile(pattern);
			Matcher m=p.matcher(pass);
			int count=0;
			while(m.find()) {
				count+=1;
				if(count==2) {
					total+=count;
					break;
				}	
			}
		}
		if(total==6) {
			return true;
			}
		else {
			return false;
		}
	}

	public static void topNcustomers() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please enter the Number of top customers to view");
		int nums  = sc.nextInt();
		connectDB();
		query="SELECT * FROM customers.customerstable order by AccBal desc limit "+ nums +";"; // Setup Bank Accounts Using Call able Statements
		st = con.createStatement();
		rs = st.executeQuery(query);
		if (rs.next()) {
			System.out.println("\n-----------------------------------");
			System.out.println("	Top "+nums+" Customers");
			System.out.println("-----------------------------------");
			System.out.print("CustID" + "\t");
			System.out.print("accNo" + "\t");
			System.out.print("Name" + "\t");
			System.out.println("Balance");
			System.out.println("-----------------------------------");
		}
		do {
			System.out.print(" "+rs.getInt("custID") + "\t");
			System.out.print(rs.getInt("AccNum") + "\t");
			System.out.print(rs.getString("AccName") + "\t");
			System.out.println(rs.getInt("AccBal"));
						
		} while (rs.next()); 
		System.out.println("-----------------------------------");
		closeDB();	
	}

	protected static void viewAllCustomers() throws SQLException, ClassNotFoundException {
		connectDB();
		query="SELECT * FROM customers.customerstable;"; // Setup Bank Accounts Using Call able Statements
		st = con.createStatement();
		rs = st.executeQuery(query);
		if (rs.next()) {
			System.out.println("\n-----------------------------------");
			System.out.println("	Customers List");
			System.out.println("-----------------------------------");
			System.out.print("CustID" + "\t");
			System.out.print("accNo" + "\t");
			System.out.print("Name" + "\t");
			System.out.println("Balance");
			System.out.println("-----------------------------------");
		}
		do {
			System.out.print(" "+rs.getInt("custID") + "\t");
			System.out.print(rs.getInt("AccNum") + "\t");
			System.out.print(rs.getString("AccName") + "\t");
			System.out.println(rs.getInt("AccBal"));
						
		} while (rs.next()); 
		System.out.println("-----------------------------------");
		closeDB();	
	}

	public static void viewAllTransactions() throws ClassNotFoundException, SQLException {
		connectDB();
		query="SELECT * FROM customers.transactions;"; // Setup Bank Accounts Using Call able Statements
		st = con.createStatement();
		rs = st.executeQuery(query);
		if (rs.next()) {
			System.out.println("\n-----------------------------------------------------------");
			System.out.println("			Transaction List");
			System.out.println("-----------------------------------------------------------");
			System.out.print("CustID" + "\t\t");
			System.out.print("Date & Time" + "\t");
			System.out.print("Transaction" + "\t");
			System.out.println("   Amount");
			System.out.println("-----------------------------------------------------------");
		}
		do {
			System.out.print(" "+rs.getInt("custID") + "\t");
			java.sql.Timestamp timestampObj = rs.getTimestamp("DateAndTime");
			System.out.print(timestampObj.toString() + "\t");
			System.out.print(rs.getString("transactionHistory") + "\t");
			System.out.println("    "+rs.getInt("Amount"));
						
		} while (rs.next()); 
		System.out.println("-----------------------------------------------------------");
		closeDB();	
		
	}
}



//drop table customers.customerstable; 
//drop table customers.transactions_customer;
//drop table customers.transactions_bank;



//create table customers.CustomersTable (custID int , AccNum int, AccName varchar(50), AccBal Double(10,2), AccPwd1 varchar(20),  AccPwd2 varchar(20), AccPwd3 varchar(20), primary key (custID) );
//create table customers.Transactions_Customer (custID int , TransactionID int,  DateAndTime  TIMESTAMP not null,  transactionHistory varchar(255), Amount int, Balance int);
//create table customers.Transactions_Bank (custID int , TransactionID int,  DateAndTime  TIMESTAMP not null,  transactionHistory varchar(255), Amount int, Balance int);
//INSERT into customers.CustomersTable values (1, 11011, 'Vignesh', 10000.00, 'BBbb22', '', '');
//INSERT into customers.Transactions_Customer values (1,1, now(),  'Account Created Successfully',10000, 10000);
//INSERT into customers.Transactions_Bank values (1,1, now(),  'Account Created Successfully',10000, 10000);
//INSERT into customers.CustomersTable values (2, 22022, 'Kumar', 10000.00, 'CCcc33', '', '');
//INSERT into customers.Transactions_Customer values (2,1,now(),  'Account Created Successfully',10000, 10000);
//INSERT into customers.Transactions_Bank values (2,1,now(),  'Account Created Successfully',10000, 10000);
//INSERT into customers.CustomersTable values (3, 33033, 'Mani', 10000.00, 'DDdd44', '', '');
//INSERT into customers.Transactions_Customer values (3,1, now(), 'Account Created Successfully',10000, 10000);
//INSERT into customers.Transactions_Bank values (3,1, now(), 'Account Created Successfully',10000, 10000);
//INSERT into customers.CustomersTable values (4, 44044, 'Mohan', 10000.00, 'EEee55', '', '');
//INSERT into customers.Transactions_Customer values (4,1,now(),  'Account Created Successfully',10000, 10000);
//INSERT into customers.Transactions_Bank values (4,1,now(),  'Account Created Successfully',10000, 10000);
//INSERT into customers.CustomersTable values (5, 55055, 'Krishna', 10000.00, 'FFff66', '', '');
//INSERT into customers.Transactions_Customer values (5,1, now(), 'Account Created Successfully',10000, 10000);
//INSERT into customers.Transactions_Bank values (5,1, now(), 'Account Created Successfully',10000, 10000);


