package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestModel {
	public static void main(String[] args) throws Exception {
		
		// testUpdate();
		// testnextPk();
		// testdelet();
		// testSearch1();
		testSearch2();
		//testfindById();
		 }

	private static void testfindById() throws Exception {
		UserModel model=new UserModel();
		UserBean bean =model.findById(1);
		// bean=new UserBean();
		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getMobileNumber());
		
		
	}

	private static void testSearch2() throws Exception {
		UserBean bean1=new UserBean();
		bean1.setFirstName("h");
		UserModel model=new UserModel();
		List<UserBean> list=model.search(bean1);
		
		Iterator<UserBean> it=list.iterator();
		while(it.hasNext()) {
			UserBean bean=it.next();
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getFirstName());
			System.out.print("\t"+bean.getLastName());
			System.out.print("\t"+bean.getLoginId());
			System.out.print("\t"+bean.getPassword());
			System.out.println("\t"+bean.getMobileNumber());
		}
		
	}

	private static void testSearch1() throws Exception {
		UserModel modle=new UserModel();
		List<UserBean> list= modle.search();
		
	      Iterator<UserBean> it=list.iterator();
	      while(it.hasNext()) {
	    	  UserBean bean= it.next();
	    	System.out.print(bean.getId());
	    	System.out.print("\t"+bean.getFirstName());
	    	System.out.print("\t"+bean.getLastName());
	    	System.out.print("\t"+bean.getLoginId());
	    	System.out.print("\t"+bean.getPassword());
	    	System.out.println("\t"+bean.getMobileNumber());
	      }
		
	}

	private static void testdelet() throws Exception {
	UserModel model=new UserModel();
	model.deleteId(9);
		
	}

	private static void testnextPk() throws Exception {
		UserModel modle=new UserModel();
		int i=modle.nextPk();
		System.out.println(i);
		
		
	}

	private static void testUpdate() throws Exception {
		UserBean bean= new UserBean();
		
		bean.setFirstName("madhuri");
		bean.setLastName("patelba");
		bean.setLoginId("madhuripatelba.234@gmail.com");
		bean.setPassword("bhiya");
		bean.setMobileNumber("77479670783");
		
		
		UserModel modle=new UserModel();
		modle.prepareStatment_add(bean);
		
		
	}
		
	}


