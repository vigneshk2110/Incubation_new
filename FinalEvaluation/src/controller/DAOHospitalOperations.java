package controller;

import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class DAOHospitalOperations extends DBConnection{

	public static boolean validateEmail(String email, String loginType) {
		try {
			connectDB();
			query = "SELECT userType FROM hospitalmanagement.userdetails where userEmail = ?;";
			preStmt = con.prepareStatement(query);
			preStmt.setString(1, email);
			reSet = preStmt.executeQuery();

			while (!(reSet.next())) {
				System.out.println("User Not Found");
				return false;				
			}

			if (!reSet.getString("userType").equals(loginType)) {
				System.out.println("User is Not "+ loginType +". Please Try with Different LoginType");
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static boolean validateUser(String email, String passWord) {

		try {
			connectDB();
			query = "SELECT userPass FROM hospitalmanagement.userdetails where userEmail = ?;";
			preStmt = con.prepareStatement(query);
			preStmt.setString(1, email);
			reSet = preStmt.executeQuery();
			reSet.next();

			if (passWord.equals(reSet.getString("userPass"))) {
				closeDB();
				return true;
			}


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Password Error");
		return false;
	}

	public static void deposit(double depositAmount) {
		int transactionID =0;
		double balance =0;

		try {
			connectDB();
			query = "{call hospitalmanagement.getLastBalanceAndTransactionID(?, ?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.registerOutParameter(2, Types.INTEGER);
			callStmt.execute();		

			balance = callStmt.getDouble(1) + depositAmount;
			transactionID = callStmt.getInt(2) + 1;

			query = "insert into hospitalmanagement.financialtransactions values"
					+ "("+ transactionID +", 'Deposit', "+depositAmount+","+balance+");";			

			stmt = con.createStatement();
			stmt.executeUpdate(query);
			closeDB();

			System.out.println(depositAmount + " deposited Succeffully...");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

	public static void transfer(double transferAmount) {
		int transactionID =0;
		double balance =0;
		try {
			connectDB();
			query = "{call hospitalmanagement.getLastBalanceAndTransactionID(?, ?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.registerOutParameter(2, Types.INTEGER);
			callStmt.execute();		
			transactionID = callStmt.getInt(2) + 1;
			balance = callStmt.getDouble(1);
			Scanner scan = new Scanner(System.in);

			while (transferAmount>balance) {
				System.out.println("Please Enter a lesser Amount to be transfered");
				transferAmount = scan.nextDouble();
			}

			balance = balance-transferAmount;

			query = "insert into hospitalmanagement.financialtransactions values"
					+ "("+ transactionID +", 'Transfer', "+transferAmount+","+balance+");";			

			stmt = con.createStatement();
			stmt.executeUpdate(query);
			closeDB();

			System.out.println(transferAmount + " Transferred Succeffully...");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void viewTransaction() {

		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.financialtransactions order by transactionID desc limit 5;";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************Transactions************");
			System.out.println("TransID \tDescription \tAmount \tBalance");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(2)  + "\t" + reSet.getDouble(3)  + "\t" + reSet.getDouble(4) );
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void addDoc() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Doctors Name");
		String name = scan.nextLine();
		System.out.println("Please enter the Doctors email");
		String email = scan.nextLine();
		System.out.println("Please enter the password");
		String password = scan.nextLine();
		System.out.println("Please enter the Specialization");
		String speciality = scan.nextLine();
		try {
			connectDB();
			query = "{call hospitalmanagement.getUserID(?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.execute();				
			int userID = callStmt.getInt(1) + 1;
			callStmt = null;

			query = "{call hospitalmanagement.getDoctID(?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.execute();				
			int docID = callStmt.getInt(1) + 1;
			callStmt = null;

			String userType = "Doctor";

			query = "insert into hospitalmanagement.userdetails values(?,?,?,?,?);";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, userID);
			preStmt.setString(2, name);
			preStmt.setString(3, email);
			preStmt.setString(4, password);
			preStmt.setString(5, userType);
			preStmt.execute();
			preStmt = null;

			query = "insert into hospitalmanagement.doctorsdetails values(?,?,?);";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, userID);
			preStmt.setInt(2, docID);
			preStmt.setString(3, speciality);
			preStmt.execute();
			preStmt = null;			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

	public static void addUser(String userType) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the User's Name");
		String name = scan.nextLine();
		System.out.println("Please enter the User's email");
		String email = scan.nextLine();
		System.out.println("Please enter the password");
		String password = scan.nextLine();


		try {
			connectDB();
			query = "{call hospitalmanagement.getUserID(?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.execute();				
			int userID = callStmt.getInt(1) + 1;
			callStmt = null;




			query = "insert into hospitalmanagement.userdetails values(?,?,?,?,?);";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, userID);
			preStmt.setString(2, name);
			preStmt.setString(3, email);
			preStmt.setString(4, password);
			preStmt.setString(5, userType);
			preStmt.execute();
			preStmt = null;

			if (userType.equals("Doctor")) {
				System.out.println("Please enter the Specialization");
				String speciality = scan.nextLine();

				query = "{call hospitalmanagement.getDoctID(?)}"; 
				callStmt = con.prepareCall(query);
				callStmt.registerOutParameter(1, Types.DOUBLE);
				callStmt.execute();				
				int docID = callStmt.getInt(1) + 1;
				callStmt = null;

				query = "insert into hospitalmanagement.doctorsdetails values(?,?,?);";
				preStmt = con.prepareStatement(query);
				preStmt.setInt(1, userID);
				preStmt.setInt(2, docID);
				preStmt.setString(3, speciality);
				preStmt.execute();
				preStmt = null;	
			}

			closeDB();


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

	public static void removeUser(String userType) {
		viewUserList(userType);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the User ID of the User to Be Deleted");
		int removeUserID = scan.nextInt();

		try {
			connectDB();
			query = "DELETE FROM hospitalmanagement.userdetails WHERE userID="+ removeUserID +";";
			stmt = con.createStatement();
			int result = stmt.executeUpdate(query);

			if (result == 0) {
				System.out.println("User Not Deleted");
				return;
			}
			System.out.println("User Deletion Successful");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void viewUserList(String userType) {
		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.userdetails where userType = '"+userType+"';";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************"+userType+"'s List************");
			System.out.println("User ID \tName");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(2) );
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void viewUserList() {
		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.userdetails;";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************Employee's List************");
			System.out.println("User ID \tName \tEmployee Type");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(2)  + "\t" + reSet.getString("userType"));
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void payOut(double payOutAmount) {
		int transactionID =0;
		double balance =0;
		try {
			connectDB();
			query = "{call hospitalmanagement.getLastBalanceAndTransactionID(?, ?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.registerOutParameter(2, Types.INTEGER);
			callStmt.execute();		
			transactionID = callStmt.getInt(2) + 1;
			balance = callStmt.getDouble(1);
			Scanner scan = new Scanner(System.in);

			while (payOutAmount>balance) {
				System.out.println("Please Enter a lesser Amount to be paid Out");
				payOutAmount = scan.nextDouble();
			}

			balance = balance-payOutAmount;

			query = "insert into hospitalmanagement.financialtransactions values"
					+ "("+ transactionID +", 'Vendor PayOut', "+payOutAmount+","+balance+");";			

			stmt = con.createStatement();
			stmt.executeUpdate(query);
			closeDB();

			System.out.println(payOutAmount + " PaidOut Succeffully...");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void payIn(double payInAmount) {
		int transactionID =0;
		double balance =0;
		try {
			connectDB();
			query = "{call hospitalmanagement.getLastBalanceAndTransactionID(?, ?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.DOUBLE);
			callStmt.registerOutParameter(2, Types.INTEGER);
			callStmt.execute();		
			transactionID = callStmt.getInt(2) + 1;
			balance = callStmt.getDouble(1);
			Scanner scan = new Scanner(System.in);


			balance = balance+payInAmount;

			query = "insert into hospitalmanagement.financialtransactions values"
					+ "("+ transactionID +", 'PayIn Collected', "+payInAmount+","+balance+");";			

			stmt = con.createStatement();
			stmt.executeUpdate(query);
			closeDB();

			System.out.println(payInAmount + " Collected & Added to Account Succeffully...");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void ambulenceAvailability() {

		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.ambulencedetails;";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************Ambulence's List************");
			System.out.println("AmbulenceID \tStatus");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(2));
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void changeAmbulenceStatus() {

		ambulenceAvailability();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the AmbulenceID to Assign or change the Status");
		int ambuID = sc.nextInt();

		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.ambulencedetails where ambulenceID = "+ ambuID +";";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************Ambulence's List************");
			System.out.println("AmbulenceID \tStatus");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(2));
			}



			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void changeStatus() {
		ambulenceAvailability();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the AmbulenceID to change the Status of availability");
		int ambuID = sc.nextInt();

		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.ambulencedetails where ambulenceID = "+ ambuID +";";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			while (reSet.next()) {
				if (reSet.getString(2).equals("UnAvailable")) {
					query = "UPDATE hospitalmanagement.ambulencedetails SET availabiltyStatus = 'available' WHERE ambulenceID = "+ ambuID +";";
				}
			}
			stmt = con.createStatement();
			stmt.execute(query);
			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void assignAmbulence() {

		ambulenceAvailability();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the AmbulenceID to Assign an Ambulence");
		int ambuID = sc.nextInt();


		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.ambulencedetails where ambulenceID = "+ ambuID +";";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			if (reSet.next()) {
				if(reSet.getString(2).equals("available")) {
					System.out.println("Ambulence No. "+ reSet.getInt(1) + " is Assigned");
					query = "UPDATE hospitalmanagement.ambulencedetails SET availabiltyStatus = 'UnAvailable' WHERE ambulenceID = "+ ambuID +";";
					stmt = con.createStatement();
					stmt.execute(query);

				}
				else {
					System.out.println("The selected Ambulence is Unavailable.\nPlease Select any Other Ambulence");
					assignAmbulence();
				}
			}
			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void bookAppointMent(String patientName, int patientAge) {
		int patientID = 0;
		int appointmentID = 0;


		try {
			connectDB();
			query = "{call hospitalmanagement.getLastPatientID(?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.INTEGER);
			callStmt.execute();		
			patientID = callStmt.getInt(1) + 1;

			query = "{call hospitalmanagement.getLastAppointmentID(?)}"; 
			callStmt = con.prepareCall(query);
			callStmt.registerOutParameter(1, Types.INTEGER);
			callStmt.execute();		
			appointmentID = callStmt.getInt(1) + 1;
			closeDB();

			listSpeciality();
			System.out.println("Please enter the UserID of the Doctor to fix an Appointment");
			Scanner scan = new Scanner(System.in);
			int userId = scan.nextInt();

			connectDB();
			query = "SELECT hospitalmanagement.doctorsdetails.userID, "
					+ "hospitalmanagement.doctorsdetails.specialistType, hospitalmanagement.userdetails.userName"
					+ " FROM hospitalmanagement.doctorsdetails inner join hospitalmanagement.userdetails on "
					+ "hospitalmanagement.doctorsdetails.userID = hospitalmanagement.userdetails.userID where"
					+ " hospitalmanagement.userdetails.userID =?;";			

			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, userId);
			reSet = preStmt.executeQuery();
			reSet.next();
			String docName = reSet.getString(3);


			query = "SELECT doctorID FROM hospitalmanagement.doctorsdetails where userID = ?;";

			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, userId);
			reSet = preStmt.executeQuery();
			reSet.next();
			int doctID = reSet.getInt(1);

			query = "insert into hospitalmanagement.patientdetails values(?,?, ?, ?);";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, patientID);
			preStmt.setString(2, patientName);
			preStmt.setInt(3, patientAge);
			preStmt.setString(4, docName);
			preStmt.execute();
			
			String status = "Waiting";
			
			query = "insert into hospitalmanagement.appointmentdetails values(?,?, ?, ?);";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, appointmentID);
			preStmt.setInt(2, doctID);
			preStmt.setInt(3, patientID);
			preStmt.setString(4, status);
			preStmt.executeUpdate();

			closeDB();
			
			System.out.println("Booked Appointment, Your Appointment ID is "+ appointmentID +" & you will be consulted by Dr."+ docName);


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

	public static void listSpeciality() {
		try {
			connectDB();
			query = "SELECT hospitalmanagement.doctorsdetails.userID, hospitalmanagement.doctorsdetails.specialistType, "
					+ "hospitalmanagement.userdetails.userName FROM hospitalmanagement.doctorsdetails inner join "
					+ "hospitalmanagement.userdetails on hospitalmanagement.doctorsdetails.userID = hospitalmanagement.userdetails.userID;";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************Specialist List************");
			System.out.println("UserID \tDoctor \tSpecialization");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(3) + "\t" + reSet.getString(2));
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void viewAppointments() {
		try {
			connectDB();
			query = "SELECT hospitalmanagement.appointmentdetails.doctorID, "
					+ "hospitalmanagement.patientdetails.patientName, hospitalmanagement.patientdetails.age, "
					+ "hospitalmanagement.appointmentdetails.consultStatus FROM hospitalmanagement.appointmentdetails "
					+ "inner join hospitalmanagement.patientdetails on "
					+ "hospitalmanagement.appointmentdetails.patientID = hospitalmanagement.patientdetails.patientID;";

			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);

			System.out.println("************AppointMent List************");
			System.out.println("doctorID \tPatientName \tAge \tConsultStatus");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1) + "\t" + reSet.getString(2) + "\t" +reSet.getInt(3) + "\t" + reSet.getString(4));
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static int findDocID(String email) {
		int docID = 0;
		try {
			connectDB();
			
			
			query = "SELECT hospitalmanagement.doctorsdetails.doctorID FROM hospitalmanagement.userdetails "
					+ "inner join hospitalmanagement.doctorsdetails on "
					+ "hospitalmanagement.doctorsdetails.userID = hospitalmanagement.userdetails.userID where"
					+ " hospitalmanagement.userdetails.userEmail = ?;";
			
			preStmt = con.prepareStatement(query);
			preStmt.setString(1, email);
			reSet = preStmt.executeQuery();
			reSet.next();
			docID = reSet.getInt(1);

			closeDB();
			return docID;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return docID;
	}

	public static void viewAppointments(int docID) {
		try {
			connectDB();
			query = "SELECT hospitalmanagement.appointmentdetails.doctorID, hospitalmanagement.patientdetails.patientID,"
					+ "hospitalmanagement.patientdetails.patientName, hospitalmanagement.patientdetails.age, "
					+ "hospitalmanagement.appointmentdetails.consultStatus FROM hospitalmanagement.appointmentdetails "
					+ "inner join hospitalmanagement.patientdetails on "
					+ "hospitalmanagement.appointmentdetails.patientID = hospitalmanagement.patientdetails.patientID "
					+ "where hospitalmanagement.appointmentdetails.doctorID = ?;";

			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, docID);
			reSet = preStmt.executeQuery();

			System.out.println("************AppointMent List************");
			System.out.println("doctorID \tPatientID \tPatientName \tAge \tConsultStatus");

			while (reSet.next()) {
				System.out.println(reSet.getInt(1)+ "\t" +reSet.getInt(2)  + "\t" + reSet.getString(3) + "\t" +reSet.getInt(4) + "\t" + reSet.getString(5));
			}

			closeDB();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void consultPatient(int docID) {
		viewAppointments(docID);
		
		System.out.println("Please enter the patientID to Consult from the above List");		
		Scanner scan = new Scanner(System.in);
		int patientID = scan.nextInt();
		
		while (patientID<0) {
			System.out.println("Patient ID cant be Negative");
			patientID = scan.nextInt();
		}
		
		try {
			connectDB();
			query = "update hospitalmanagement.appointmentdetails set consultStatus = 'Consulted' where patientID = ?;";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, patientID);
			preStmt.execute();
			closeDB();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Patient consulted & Tablet Prescribed");
		prescribeMedicine(docID,patientID);		
		
	}

	private static void prescribeMedicine(int docID, int patientID) {
		try {
			connectDB();
			query = "SELECT * FROM hospitalmanagement.medicinestockdetails;";
			stmt = con.createStatement();
			reSet = stmt.executeQuery(query);
			
			System.out.println("******************************************************"
						  + "\n*                 Medicine List                       *"
						  + "\n*******************************************************"
						  + "\nMedID \tMedName \tqtyAvailable");
			
			while (reSet.next()) {
				System.out.println(reSet.getInt(1)+ "\t" + reSet.getString(2) + "\t" + reSet.getInt(3));
			}
			
			System.out.println("Please enter the MedID to select the Medicine or 0 to exit");
			Scanner scan = new Scanner(System.in);
			int medID = scan.nextInt();
			
			while (medID>0) {
				
				
				query = "SELECT * FROM hospitalmanagement.medicinestockdetails where medicineID = ?;";
				preStmt = con.prepareStatement(query);
				preStmt.setInt(1, medID);
				reSet = preStmt.executeQuery();
				reSet.next();
				System.out.println("******************************************************"
						  + "\n*                 Medicine List                       *"
						  + "\n*******************************************************"
						  + "\nMedID \tMedName \tqtyAvailable");
				
				System.out.println(reSet.getInt(1)+ "\t" + reSet.getString(2) + "\t" + reSet.getInt(3));
				
				System.out.println("Please enter the Quantity in numbers");
				int quantity = scan.nextInt();
				
				while (quantity<0) {
					System.out.println("PQuantity can't be Negative");
					quantity = scan.nextInt();
				}
				
				query = "insert into hospitalmanagement.prescribedmedicine values(?, ?, ?);;";
				preStmt = con.prepareStatement(query);
				preStmt.setInt(1, patientID);
				preStmt.setInt(2, medID);
				preStmt.setInt(3, quantity);
				preStmt.execute();	
				
				 int quantityNew = reSet.getInt(3) - quantity;
				 
				 query = "update hospitalmanagement.medicinestockdetails set quantityAvailable = ? where medicineId = ?;";
					preStmt = con.prepareStatement(query);
					preStmt.setInt(1, quantityNew);
					preStmt.setInt(2, medID);
					preStmt.execute();		
					
					System.out.println("Please enter the MedID to select the Medicine or 0 to exit");
					medID = scan.nextInt();
					
			}
			
			closeDB();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void disPatchMedicine() {
		try {
			connectDB();
			query = "select distinct patientID from hospitalmanagement.prescribedmedicine;";
			preStmt = con.prepareStatement(query);
			reSet = preStmt.executeQuery();
			
			System.out.println("The medicine has been dispatched to the below list of patients");
			
			while (reSet.next()) {
				System.out.println(reSet.getInt(1));
			}
			closeDB();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



