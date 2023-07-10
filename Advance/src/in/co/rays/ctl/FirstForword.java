package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstForwordCtl")
public class FirstForword extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          System.out.println("heloo Firstforword doget");
         // response.sendRedirect("SecoundForword");
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("heloo FirstForword dopost");
		 // resp.sendRedirect("SecoundForword");
		
		String firstName= req.getParameter("fname");
		String lastName= req.getParameter("lname");
		System.out.println("mesg="+firstName+" "+lastName);
		
		req.setAttribute("Name", "sanjay");
		
		RequestDispatcher rd= req.getRequestDispatcher("SecoundForwordCtl");
		rd.forward(req, resp);
		
		
		
		
	}

}
