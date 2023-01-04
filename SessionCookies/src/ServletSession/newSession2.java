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
 * Servlet implementation class newSession2
 */
@WebServlet("/newSession2")
public class newSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newSession2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("Message3", "This comment was added in 3rd Servlet");

		String name = 	  (String) session.getAttribute("uName");  
		String pass = 	 String.valueOf(session.getAttribute("uPass")); 
		String message1 = (String) session.getAttribute("Message1"); 
		String message2 = session.getAttribute("Message2").toString(); 
		String message3 = session.getAttribute("Message3").toString(); 
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Display</title></head>");
		out.println("<body bgcolor = gold>");
		out.println(name);
		out.println("<br>");
		out.println(pass);
		out.println("<br>");
		out.println(message1);
		out.println("<br>");
		out.println(message2);
		out.println("<br>");
		out.println(message3);
		out.println("<br>");
		out.print("All Sessions Executed");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
