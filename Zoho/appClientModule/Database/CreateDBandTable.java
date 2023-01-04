package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDBandTable {

	public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","root");
			String query = "CREATE DATABASE IF NOT EXISTS Registration";
			Statement ps = con.createStatement();
			ps.execute(query);
			query = "USE registration" ;
			ps.executeUpdate(query);
			query = "CREATE TABLE IF NOT EXISTS userDetails(sNo int primary key AUTO_INCREMENT, uName varchar(25), password varchar(25))" ;
			ps.executeUpdate(query);
			query ="INSERT INTO userDetails (uName, password) VALUES ('vicky','zoho')";
			ps.executeUpdate(query);
			query ="INSERT INTO userDetails (uName, password) VALUES ('gokul','zoho1')";
			ps.executeUpdate(query);
			query ="INSERT INTO userDetails (uName, password) VALUES ('amuthan','zoho2')";
			ps.executeUpdate(query);
			query = "select * from userDetails";
			ResultSet rs = ps.executeQuery(query);
			
			while (rs.next()) {
				String unameString = rs.getString(2);
				String pass = rs.getString(3);
				System.out.println(unameString + " , " + pass);
			}
			ps.close();
			con.close();
	}
}
