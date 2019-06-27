import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends GenericServlet {
private static final long serialVersionUID = 1L;

 ServletConfig config=null;  
   
 public void init(ServletConfig config){  
 this.config=config;  
 System.out.println("servlet is initialized");  
 }  
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
 * @see Servlet#service(ServletRequest request, ServletResponse response)
 */
  
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
res.setContentType("text/html");  
  
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<b>hello simple servlet</b>");  
out.print("</body></html>");   
}  

public void destroy(){
System.out.println("servlet is destroyed");
}
  
public ServletConfig getServletConfig(){

return config;}  

public String getServletInfo()
{
return "copyright 2010-2019";
}  
  
} 