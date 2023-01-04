package vicky;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vicky", "root","root");
			String name = request.getParameter("txtName");
			String passWord = request.getParameter("txtPWD");
			String query = "select * from logindetails where uName = '"+name+"' AND passWord = '"+passWord+"'";
			//			String query = "select * from logindetails where uName = ? and passWord = ?";
			//			PreparedStatement ps = con.prepareStatement(query);
			//			ps.setString(1, name);
			//			ps.setString(2, passWord);
			
			Statement ps = con.createStatement();

			ResultSet rs = ps.executeQuery(query);
			if (rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
			}
			else {

				out.println("<font color = green size = 20>Login Failed!!!<br><br>");
				out.println("<a href = Login.jsp>Try Again?</a>");
			}

		} catch (Exception e) {

			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
