package LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
//		System.out.println("servlet called");
		String name = request.getParameter("a");
		String password = request.getParameter("b");
		String role = request.getParameter("c");
		// response.getWriter().print("Name is "+name + "," + password+ "," + role );

		String url = "jdbc:mysql://localhost:3306/hospital";
		String dbUser = "root";
		String dbPassword = "root";

		try {
			
			PrintWriter out = response.getWriter();
//			System.out.println("Servlet call - 1");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, dbUser, dbPassword);
			Statement st = con.createStatement();
			String query = "use hospital";
			st.execute(query);
			query = "select * from userlogindetails where username='" + name + "'";
//			System.out.println("Servlet call - 2");
			ResultSet rs = st.executeQuery(query);
			String res="";
//			System.out.println(name);
//			System.out.println(password);
//			System.out.println(role);

			if (rs.next()  && rs.getString(2).equals(password)) {
				if (rs.getString(3).equals("Doctor")) {
//					System.out.println("Servlet call - Doctor Login Successful");
//					RequestDispatcher rd = request.getRequestDispatcher("DoctorLoginPage.jsp");
//					response.sendRedirect("DoctorLoginPage.jsp");
//					rd.forward(request, response);
					res="Doctor";
					
				} else if (rs.getString(3).equals("Admin")) {
//					System.out.println("Servlet call - Admin Login Successful");
//					RequestDispatcher rd = request.getRequestDispatcher("AdminLoginPage.jsp");
//					rd.forward(request, response);
					res="Admin";
				} else {
//					System.out.println("Servlet call - Admin Login Successful");
//					RequestDispatcher rd = request.getRequestDispatcher("StaffLoginPage.jsp");
//					rd.forward(request, response);
					res="Staff";
				}
//				System.out.println(res);
				
				response.setContentType("text/plain");
				out.print(res);
				
			}
			else {
				response.sendRedirect("Login.jsp");
			}
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
