

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SesLogin
 */
@WebServlet("/SesLogin")
public class SesLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SesLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   try {
		   response.setContentType("text/html");
		   PrintWriter pwriter=response.getWriter();
		   
		   
		   String name=request.getParameter("userName");
		   String password=request.getParameter("userPassword");
		   pwriter.println("Hello"+name);
		   pwriter.println("Your Password is:  "+password);
		   
		   
		   
		   HttpSession session=request.getSession();
		   
		   pwriter.println("Session Id :"+session.getId());
		   
		   pwriter.println("Session Created Time :"+session.getCreationTime()); 
		   session.setAttribute("uname", name);
		   session.setAttribute("upass", password);
		   pwriter.print("<a href='SesWelcome'> View details</a>");
		   pwriter.close();
	   }
	   catch(Exception exp)
	   {
		   System.out.println(exp);
		   
	   }
	}

}