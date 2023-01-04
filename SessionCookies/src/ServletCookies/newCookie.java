package ServletCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newCookie
 */
//@WebServlet("/session")
@WebServlet(name = "newCookie1", urlPatterns = { "/newCookie1" })
public class newCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie []= request.getCookies();
		String nameString = null;
		String passString = null;
//		String status = null;
		for (Cookie c : cookie) {
			if (c.getName().equals("Name")) {
				nameString = c.getValue();
			}
			else if (c.getName().equals("Password")) {
				passString = c.getValue();
			}
//			else if (c.getName().equals("Status")) {
//				status = c.getValue();
//			}
		}

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Display</title></head>");
		out.println("<body bgcolor = gold>");
		out.println(nameString);
		out.println("<br>");
		out.println(passString);
		out.println("<br>");
//		out.println(status);

		out.print("All Cookies Executed");
		out.println("</body></html>");
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		Cookie cookie []= request.getCookies();
		//		String nameString = null;
		////		String passString = null;
		////		String status = null;
		//		for (Cookie c : cookie) {
		//			if (c.getName().equals("Name")) {
		//				nameString = c.getValue();
		//			}
		////			else if (c.getName().equals("Password")) {
		////				passString = c.getValue();
		////			}
		////			else if (c.getName().equals("Status")) {
		////				status = c.getValue();
		////			}
		//		}
		//		
		//		PrintWriter out = response.getWriter();
		//		out.println("<html>");
		//		out.println("<head><title>Display</title></head>");
		//		out.println("<body bgcolor = gold>");
		//		out.println(nameString);
		//		out.println("<br>");
		////		out.println(passString);
		////		out.println("<br>");
		////		out.println(status);
		//		
		//		out.print("All Cookies Executed");
		//		out.println("</body></html>");
	}

}
