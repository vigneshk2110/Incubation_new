package ServletCookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookies
 */
@WebServlet("/cookies")
public class cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uName = request.getParameter("txtName");
		String uPass = request.getParameter("txtPWD");
		
		Cookie cookie = new Cookie("Name", uName);
		Cookie cookie1 = new Cookie("Password", uPass);
//		Cookie cookie2 = new Cookie("Status", "Success");
		response.addCookie(cookie);
		response.addCookie(cookie1);
//		response.addCookie(cookie2);
		
		response.sendRedirect("newCookie1");
				
		
	
	}

}
