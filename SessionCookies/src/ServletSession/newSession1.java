package ServletSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class newSession1
 */
@WebServlet("/newSession1")
public class newSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public newSession1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
//		String name = 	  session.getAttribute("uName").toString();  
//		String pass = 	 session.getAttribute("uPass").toString(); 
		
		 session.setAttribute("Message2", "This comment was added in 2nd Servlet");
		
		response.sendRedirect("newSession2");

//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head><title>Display</title></head>");
//		out.println("<body bgcolor = red>");
//		out.println(name);
//		out.println("<br>");
//		out.println(pass);
//		out.println("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		HttpSession session = request.getSession();
//		String name = 	  session.getAttribute("uName").toString();  
//		String pass = 	 session.getAttribute("uPass").toString();  
//
//		PrintWriter out = response.getWriter();
//		out.println(name);
//		out.print(pass);
	}

}
