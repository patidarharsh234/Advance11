package in.co.rays.ctl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserListCtl.do")
public class UserListCtl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget userListCtl ");
		
		UserModel modle=new UserModel();
	
	 try {
				List<UserBean> list= modle.search();
				req.setAttribute("List", list);
				
				RequestDispatcher rd=req.getRequestDispatcher("UserListView.jsp");
				rd.forward(req, resp);
				System.out.println("done UesrListCtl");
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("dopost UserListCtl");
	
	
	UserModel modle=new UserModel();
	
	String op= req.getParameter("operation");
	String name=req.getParameter("name");
	UserBean bean=new UserBean();
	  bean.setFirstName(name);
	
	System.out.println(name);
	
	if(op.equals("search")) {

		try {
	
			List<UserBean> list=modle.search(bean);
			req.setAttribute("List", list);
			
			RequestDispatcher rd=req.getRequestDispatcher("UserListView.jsp");
			rd.forward(req, resp);
			System.out.println("serch name complet...!!!");
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	}
}
