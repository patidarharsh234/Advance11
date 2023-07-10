package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.AddDateBean;
import in.co.rays.model.AddDateModel;
import in.co.rays.model.UserModel;

@WebServlet("/AddDateCtl")
public class AddDateCtl extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		String dob=req.getParameter("dob");
		System.out.println(dob);
		
		AddDateBean bean=new AddDateBean();
		try {
			bean.setDob(sdf.parse(dob));
			
			System.out.println(bean.getDob());
			
			AddDateModel model= new AddDateModel();
			model.Add(bean);
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
