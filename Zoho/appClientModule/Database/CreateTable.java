package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String userName = "root";
		String passWord = "root";
		String url = "jdbc:mysql://localhost/sample";
		
		try {
					
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		
//		String query = "CREATE TABLE employees(sNo int, Name varchar(50), Mobile varchar(50))";
//		st.executeUpdate(query);
//		
//		String query1 = "INSERT INTO employees VALUES(1, 'vicky', '98765')";
//		st.executeUpdate(query1);
//		
//		query1 = "INSERT INTO employees VALUES(2, 'Gokul', '18765')";
//		st.executeUpdate(query1);
//		
//		query1 = "INSERT INTO employees VALUES(3, 'Ammuthan', '21865')";
//		st.executeUpdate(query1);
//		
//		query1 = "INSERT INTO employees VALUES(4, 'suba', '321865')";
//		st.executeUpdate(query1);
//		
//		query1 = "INSERT INTO employees VALUES(5, 'sudeva', '51865')";
//		st.executeUpdate(query1);
		
		String query1 = "TRUNCATE TABLE employees";
		st.executeUpdate(query1);
		
//		ResultSet rs = st.executeQuery("SELECT * from employees");
		
//		while (rs.next()) {
//			System.out.println(rs.getString(1) + ", " + rs.getString(2)+ ", " + rs.getString(3));
//		}
		
		st.close();
		con.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
