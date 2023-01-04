package hospitalOPD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC extends OPDCaller {

	public static void main(String[] args) {
		String uName = "root";
		String pass = "root";
		
		String url = "jdbc:mysql://localhost/register";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");      // Loading & registering the driver
			
			Connection con = DriverManager.getConnection(url, uName,pass); // connection Object creation
			
			
			Statement st = con.createStatement();
			
			String queryString = "INSERT INTO student VALUES(5, 'Suba', '176509', 'Trichy')";
			
			
			st.executeUpdate(queryString);
			
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
