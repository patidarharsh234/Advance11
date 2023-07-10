package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//jspToServlet

@WebServlet("/secound")
public class SecoundServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  String fname= req.getParameter("fname");
      String lname=req.getParameter("lname");
      String login= req.getParameter("loginId");
      String pwd=  req.getParameter("pwd");
      resp.setContentType("text/html");
      PrintWriter out= resp.getWriter();
      out.println("<h1>secound Servlet.....!!!!</h1>");
      out.write("fname");
      out.write("lname");
      out.write("login");
      out.write("pwd");
      out.println(fname+" "+lname+" "+login+" "+pwd);
      out.close();
      

	}
	
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    }
}
