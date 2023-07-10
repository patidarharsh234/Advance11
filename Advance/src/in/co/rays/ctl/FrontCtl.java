package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "FrontCtl",urlPatterns = {"*.do"})
public class FrontCtl implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		HttpSession sess=req.getSession();
		String uri=req.getRequestURI();
		req.setAttribute("uri", uri);
		
		if(sess.getAttribute("name")==null) {
			
		    RequestDispatcher rd= req.getRequestDispatcher("LoginView.jsp");
		    req.setAttribute("msg","session Expired plz login again.....!!!");
			rd.forward(req, resp);
			

		}else {
			chain.doFilter(request, response);
		}
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	
	}
	@Override
	public void destroy() {
		
	}
}
