package in.co.rays.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionM extends HttpServlet {

	public static void sessionInvalidate(HttpServletRequest request) {
		HttpSession session= request.getSession();
		session.invalidate();
	}
	public static void sessionGenerate(String key,String value,HttpServletRequest request) throws Exception {
		HttpSession session= request.getSession();
		session.setAttribute(key, value);
	//	session.setMaxInactiveInterval(20);
		

		

	}
	public static void sessionDateTiem(HttpServletRequest request,HttpServletResponse responce) throws Exception { 
		
		HttpSession session= request.getSession();
		Date created=new Date(session.getCreationTime());
		Date accessed= new Date(session.getLastAccessedTime());
		PrintWriter out=responce.getWriter();
		out.println("id="+session.getId());
		out.println("created="+created);
		out.println("accessed="+accessed);
	}
	

}
