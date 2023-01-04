package Database;

import java.sql.*;

/*
1.Import Package -----> java.sql.*;
2. Load & register the driver ----> com.mysql.jdbc.Driver
3. Establish Connection ---> Create object of Connection Interface
4. Create Statement ---> Create object of Statement Interface
5. Execute the query 
6. process the result
7. Close the Connection.
*/

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String uName = "root";
		String pass = "root";
		
		String url = "jdbc:mysql://localhost/sample";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");      // Loading & registering the driver
		
//		Connection con = DriverManager.getConnection(url, uName, pass); // connection Object creation
		Connection con = DriverManager.getConnection(url, uName,pass); // connection Object creation
		
		
		Statement st = con.createStatement();
		
		String queryString = "INSERT INTO student VALUES(5, 'Suba', '176509', 'Trichy')";
		
//		String queryString = "DELETE FROM student where sNo = 5";
		
		st.executeUpdate(queryString);
		st.execute(queryString);
	
		
		
		ResultSet rSet = st.executeQuery("select * from student");
		
		while (rSet.next()) {
			System.out.println(rSet.getString(1) + ", " + rSet.getString(2) 
			+ ", " + rSet.getString(3) + ", " + rSet.getString(4) );
		}
		
		st.close();
		con.close();}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
