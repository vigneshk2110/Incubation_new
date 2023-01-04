package zCoins;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DBConnect {

	private static final String DBdriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBurl = "jdbc:mysql://localhost:3306/ZUniverse";
	private static final String DBUname = "root";
	private static final String DBPass = "root";	

	protected static Connection con;
	protected static Statement St;
	protected static PreparedStatement preSt;
	protected static CallableStatement callSt;
	protected static  ResultSet rs;
	protected static String query = "";


	protected static void connectDB() throws ClassNotFoundException, SQLException {

		Class.forName(DBdriver);
		con = DriverManager.getConnection(DBurl, DBUname, DBPass);

	}

	protected static void closeDB() throws SQLException {
		if( !(rs==null)) {
			rs.close();
			rs = null;
		}
		if (!(St==null)) {
			St.close();
			St = null;
		}
		if (!(preSt==null)) {
			preSt.close();
			preSt = null;			
		}		
		if (!(callSt==null)) {
			callSt.close();
			callSt = null;
		}
		if (!(con==null)) {
			con.close();
			con = null; 
		}
	}

	public static void addUser(String name, long mobNum, int hID, String email, String pass, double realCurrency) throws ClassNotFoundException, SQLException {
		connectDB();
		query="SELECT * FROM zuniverse.userdetails;"; 
		St = con.createStatement();
		rs = St.executeQuery(query);

		if (!rs.next()) {
			query="insert into zuniverse.userdetails values (1001, '"+ name +"',"+  mobNum +", "+ hID +", '"+ email + "', '" + pass +"', "+ realCurrency +", '-');"; 
			St.executeUpdate(query);

		}
		else {
			int zid = getLastZID()+ 10;
			query="insert into zuniverse.userdetails values ("+ zid +", '"+ name +"',"+  mobNum +", "+ hID +", '"+ email + "', '" + pass +"', "+ realCurrency +", '-');"; 
			St.executeUpdate(query);			
		}		
		closeDB();

	}

	public static int getLastZID() throws SQLException, ClassNotFoundException {

		query="{call getLastZID(?)}";
		callSt = con.prepareCall(query);
		callSt.registerOutParameter(1, Types.INTEGER);
		callSt.executeUpdate();
		int zid =callSt.getInt(1);
		return zid;
	}

	public static void setUpDB() throws ClassNotFoundException, SQLException {
		connectDB();
		query="{call SetupDB()}"; // Setup Bank Accounts Using Call able Statements
		callSt = con.prepareCall(query);		
		callSt.execute();		
		closeDB();

	}

	public static void approveUsers() throws ClassNotFoundException, SQLException {
		connectDB();
		query="SELECT * FROM zuniverse.userdetails where UserStatus='-';"; 
		St = con.createStatement();
		rs = St.executeQuery(query);

		while (rs.next()) {

			//			UPDATE table_name
			//			SET column1 = value1, column2 = value2, ...
			//			WHERE condition;

			query="SELECT * FROM zuniverse.userdetails where UserStatus='-';"; 
			St = con.createStatement();
			rs = St.executeQuery(query);

		}

	}
}
