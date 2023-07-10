package in.co.rays.extramethodes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/requestInfo")
public class RequestInfo extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	
	PrintWriter out= resp.getWriter();
	out.println("<h3>Request Information Example</h3>");
	
	out.println("method:" +req.getMethod());
	out.println("       ");
	out.println("request Uri:" + req.getRequestURI() );
	out.println("       ");
	out.println("protocol:" + req.getProtocol());
	out.println("       ");
	out.println("remote Address:" + req.getRemoteAddr());
	out.println("       ");
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
}


