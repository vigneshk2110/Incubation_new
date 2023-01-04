package ServletSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class session
 */
@WebServlet("/session")
public class session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public session() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		 session.setAttribute("uName",request.getParameter("txtName"));  
		 session.setAttribute("uPass",request.getParameter("txtPWD"));  
		 session.setAttribute("Message1", "This comment was added in 1st Servlet");
		  		
		response.sendRedirect("newSession1");
		
//		RequestDispatcher rd = request.getRequestDispatcher("newSession1");
//		rd.include(request, response);
		
	}

}
