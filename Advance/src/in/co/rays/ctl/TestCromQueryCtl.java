package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestCromQueryCtl")
public class TestCromQueryCtl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name=req.getParameter("name");
//		String city=req.getParameter("city");
//		System.out.println(name+" "+city);
		
 //Array Values Ak key me do values
		String name=req.getParameter("name");
		String[] city=req.getParameterValues("city");
		System.out.println(name);
		for(String string:city) {
			System.out.println(string);
		}
		
	}

}
