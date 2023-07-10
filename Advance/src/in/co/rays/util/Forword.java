package in.co.rays.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forword extends HttpServlet {
	

	public static void forword(String path,HttpServletRequest request,HttpServletResponse responce) throws Exception, IOException {
		
		RequestDispatcher rd= request.getRequestDispatcher(path);
	    rd.forward(request, responce);
		
		
	}


}
