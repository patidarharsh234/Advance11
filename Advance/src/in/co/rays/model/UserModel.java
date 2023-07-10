package in.co.rays.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.bean.AddDateBean;
import in.co.rays.bean.UserBean;
import in.co.rays.util.JDBCDataSource;

public class UserModel {
	
       public  void prepareStatment_add(UserBean bean) throws Exception {
		Connection conn= JDBCDataSource.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("insert into user1 values(?,?,?,?,?,?)");

		ps.setInt(1,nextPk());
		ps.setString(2,bean.getFirstName());
		ps.setString(3,bean.getLastName());
		ps.setString(4, bean.getLoginId());
		ps.setString(5,bean.getPassword());
		ps.setString(6,bean.getMobileNumber());
		
		
	int i=	ps.executeUpdate();
	System.out.println("insert="+i);
		
	
}
       public Integer nextPk() throws Exception  {
    	 int  pk=0;
    	 Connection conn=JDBCDataSource.getConnection();
    	 PreparedStatement ps=conn.prepareStatement("select max(id) from user1");
    	 ResultSet rs=ps.executeQuery();
    	 while(rs.next()) {
    		 pk=rs.getInt(1);
    	 }
    	 return pk+1;
       }
       public int deleteId(int id) throws Exception {
    	   
    	   Connection conn= JDBCDataSource.getConnection();
    	  PreparedStatement ps= conn.prepareCall("delete from user1 where id=?");
    	  ps.setInt(1,id);
    	  
    	  int i =ps.executeUpdate();
    	  System.out.println("delet="+i);
    	  
    	   return id;
    	   
       }
      
       public List<UserBean>  search() throws Exception{
    	 Connection conn=JDBCDataSource.getConnection();
    	 PreparedStatement ps=conn.prepareCall("select * from user1;");
    	 ResultSet rs=ps.executeQuery();
    	  ArrayList<UserBean> list=new ArrayList<UserBean>();
    	  UserBean bean=null;
    	  
    	  while(rs.next()) {
    		  bean=new UserBean();
    		  bean.setId(rs.getInt(1));
    		  bean.setFirstName(rs.getString(2));
    		  bean.setLastName(rs.getString(3));
    		  bean.setLoginId(rs.getString(4));
    		  bean.setPassword(rs.getString(5));
    		  bean.setMobileNumber(rs.getString(6));
    		  list.add(bean);
    		  
    	  }
    	  
    	 
    	 
    	   
		return list;  
    	   
       }
       
       
       public List<UserBean> search(UserBean bean) throws Exception{
    	   Connection conn= JDBCDataSource.getConnection();
    	   StringBuffer sb= new StringBuffer("select * from user1 where 1=1");
    	   
    	   if(bean!=null) {
    		   if(bean.getFirstName()!=null) {
    			   sb.append(" and Firstname like'"+bean.getFirstName()+"%'");
    			   System.out.println(sb);
    		   }
    	   }
    	   PreparedStatement ps=conn.prepareStatement(sb.toString());
    	   System.out.println("done");
    	   ResultSet rs= ps.executeQuery();
    	   
    	   
    	   ArrayList<UserBean> list=new ArrayList<UserBean>();
    	   
    	   
    	   while(rs.next()) {
    		   bean=new UserBean();
    		   bean.setId(rs.getInt(1));
    		   bean.setFirstName(rs.getString(2));
    		   bean.setLastName(rs.getString(3));
    		   bean.setLoginId(rs.getString(4));
    		   bean.setPassword(rs.getString(5));
    		   bean.setMobileNumber(rs.getString(6));
    		   list.add(bean);
    	   }
    	   
    	   
		return list;
    	   
       }
       
       public UserBean findByRollNumber(int rollno) throws Exception {
    	  
    	  Connection conn= JDBCDataSource.getConnection();
    	 PreparedStatement ps=  conn.prepareStatement("select * from usere1 where rollno=?");
    	 System.out.println("done");
    	 
    	 
    		 ps.setInt(1, rollno);
    		 
    		 UserBean  bean=null;
    	ResultSet rs= ps.executeQuery();
    	
    	while(rs.next()) {
    		bean =new UserBean();
    		bean.setId(rs.getInt(1));
    		bean.setFirstName(rs.getString(2));
    		bean.setLastName(rs.getString(3));
    		bean.setLoginId(rs.getString(4));
    		bean.setPassword(rs.getString(5));
    		bean.setMobileNumber(rs.getString(6));
    	}
    
    	
    	   
		return bean;
    	   
       }
        
       
       public static UserBean authenticate(String login, String password) throws SQLException {
    	   
    	   Connection conn=JDBCDataSource.getConnection();
    	   PreparedStatement ps=conn.prepareStatement("select * from user1 where loginId=? and password=?");
    	   ps.setString(1, login);
    	   ps.setString(2, password);
    	   
    	   ResultSet rs= ps.executeQuery();
    	   
    	   UserBean bean=null;
    	   
    	   while(rs.next()) {
    		   bean=new UserBean();
    		   bean.setId(rs.getInt(1));
    		   bean.setFirstName(rs.getString(2));
    		   bean.setLastName(rs.getString(3));
    		   bean.setLoginId(rs.getString(4));
    		   bean.setPassword(rs.getString(5));
    		   bean.setMobileNumber(rs.getString(6));
    		   
    	   }
		return bean;
    	   
       }
       
       
       
       public UserBean findById(int id) throws Exception {
    	   
    	 Connection conn= JDBCDataSource.getConnection();
    	 PreparedStatement ps=  conn.prepareStatement("select * from user1 where id=?");
    	 System.out.println("done");
    	 
    	 
    		 ps.setInt(1, id);
    		 
    		 
    	ResultSet rs= ps.executeQuery();
    	
    	
    	UserBean bean=null;
    	
    	while(rs.next()) {
    		 bean=new UserBean();
    		bean.setId(rs.getInt(1));
    		bean.setFirstName(rs.getString(2));
    		bean.setLastName(rs.getString(3));
    		bean.setLoginId(rs.getString(4));
    		bean.setPassword(rs.getString(5));
    		bean.setMobileNumber(rs.getString(6));
    	}
    	
    	   
	 return bean;
	
    	   
       }
       
       public  void updateId(UserBean bean) throws Exception {
		Connection conn= JDBCDataSource.getConnection();
		
		PreparedStatement ps=conn.prepareStatement( "update user1 set firstName=?,lastName=?, loginId=?, password=?,mobileNumber=? where id=?");
		  
	System.out.println(bean.getFirstName());
		  
        System.out.println("add");
		
		ps.setString(1,bean.getFirstName());
		ps.setString(2,bean.getLastName());
		ps.setString(3, bean.getLoginId());
		ps.setString(4,bean.getPassword());
		ps.setString(5,bean.getMobileNumber());
		ps.setInt(6, bean.getId());
		
		
		
	int i=	ps.executeUpdate();
	System.out.println("insert="+i);

  }
       
   }

	   

