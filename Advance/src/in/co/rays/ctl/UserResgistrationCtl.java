package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserResgistrationCtl")
public class UserResgistrationCtl extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
		System.out.println("id="+id);
		
		if(id !=null) {
	
			UserModel model=new UserModel();
			try {
				UserBean bean1 = model.findById(Integer.parseInt(id));
				req.setAttribute("bean1",bean1);
				System.out.println("request done");
			} catch (Exception e) {
				e.printStackTrace();
			}
			   
			       
			
			
		}
		
		RequestDispatcher rd= req.getRequestDispatcher("UserResgistration.jsp");
		 rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   String id=req.getParameter("id");
		System.out.println("id="+id);
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String loginId=req.getParameter("loginId");
		String pwd=req.getParameter("pwd");
		String mobile=req.getParameter("mobile");
		
		String op= req.getParameter("operation");
		
		System.out.println("request done...!!");
	
		
		UserBean bean=new UserBean();
		
		
		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLoginId(loginId);
		bean.setPassword(pwd);
		bean.setMobileNumber(mobile);
		
		
		
		if(op.equals("Add")) {
			
		
		UserModel model=new UserModel();
		try{
			model.prepareStatment_add(bean);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		}
		
		
		if(op.equals("update")) {
		
			
			bean.setId(Integer.parseInt(id));
			
			UserModel model=new UserModel();
			try {
	             model.updateId(bean);
	        System.out.println("update done");

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
