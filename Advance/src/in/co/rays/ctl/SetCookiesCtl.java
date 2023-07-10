package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookiesCtl")
public class SetCookiesCtl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
		resp.setContentType("text/html");
	   PrintWriter out=resp.getWriter();
	   
	  // set a cookie
	   String login=req.getParameter("login");
	   String password=req.getParameter("password");
	   
	   Cookie c=new Cookie(login, password);
	 //  c.setMaxAge(50);
	   resp.addCookie(c);
	   
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
