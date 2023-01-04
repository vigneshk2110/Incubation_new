package HospitalOPD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/userdetails";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			String query = "select * from infotable";
			PrintWriter out = response.getWriter();
			ResultSet rs = st.executeQuery(query);
			
			out.println("<html>");
			out.println("<head><title>Display</title></head>");
			out.println("<body>");
			out.println("<table>");

			if (rs.next()) {
				
				
				out.println("<tr><td>Name</td>"
						+ "<td>In-Time</td>"
						+ "<td>Treatment-Time</td>"
						+ "<td>Out-Time</td>"
						+ "<td>Waiting-Time</td>"
						+ "<td>Message</td></tr>");
				do {
					out.println("<tr><td>"+rs.getString(2)+"</td><td>"+rs.getString(4)+"</td>"
							+ "<td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td>"
									+ "<td>"+rs.getString(7)+"</td>\"<td>"+rs.getString(8)+"</td></tr>");
					
				} while (rs.next());
				
				out.println("</table>");
				out.println("</body></html>");
				out.close();
			} else {
				out.println("No Out Patients");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
