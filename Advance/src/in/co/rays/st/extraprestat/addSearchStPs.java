package in.co.rays.st.extraprestat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.co.rays.util.JDBCDataSource;

public class addSearchStPs {
	public static void main(String[] args) throws Exception {
		 Stestaments_search();
	}
		private static void Stestaments_search() throws Exception {
			 Connection conn=JDBCDataSource.getConnection();
			  Statement st =  conn.createStatement();
			  ResultSet rs =  st.executeQuery("select * from user1");
			  System.out.println("id"+"\t"+"firstName"+"\t"+"lastName"+"\t"+"loginId"+"\t"+"\t"+"\t"+"password"+"\t"+"mobileNumber");
			  while(rs.next()) {
				  
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3)+"\t"+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+"\t"+rs.getString(6));
			
		}

		 }
	}

