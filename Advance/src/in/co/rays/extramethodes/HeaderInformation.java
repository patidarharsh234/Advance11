package in.co.rays.extramethodes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HeaderInfo")
public class HeaderInformation extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		
		
//		Enumeration e=req.getHeaderNames();
//		while(e.hasMoreElements()) {
//			String name=(String)e.nextElement();
//			String value=req.getHeader(name);
//			System.out.println(name+" = "+value);
//		}
			
			
			Enumeration e1=req.getParameterNames();
			while(e1.hasMoreElements()) {
				String name1=(String)e1.nextElement();
				System.out.println(name1);
			}	
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
