package in.co.rays.ctl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecoundForwordCtl")
public class SecoundForword extends HttpServlet {

       
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     System.out.println("SecoundForword doget");
	     
	 	String firstName= req.getParameter("fname");
		String lastName= req.getParameter("lname");
		
		System.out.println("mesg="+firstName+" "+lastName);
		
	    
	   
	   
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("SecoundForword dopost");
			String firstName= req.getParameter("fname");
			String lastName= req.getParameter("lname");
			System.out.println("mesg="+firstName+" "+lastName);
			
			
			String name=(String) req.getAttribute("Name");
			System.out.println("mesg="+firstName+" "+lastName+" "+name);
	}

}
