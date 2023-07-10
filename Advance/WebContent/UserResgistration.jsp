<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="Header.jsp"%>
	<%
	 UserBean bean=(UserBean)request.getAttribute("bean1");
	%>
	

	
	<% if(bean !=null){  %>
	
		<center>
		     <form action="UserResgistrationCtl" method="post">
			<table>
				
				<tr>
				<td><input type="hidden" name="id" value=<%=bean.getId()%>></td>
				</tr>
				<tr>
					<th>firstName :</th>
					<td><input type="text"  name="fname" value=<%= bean.getFirstName()%>></td>
				</tr>
				<tr>
					<th>lastName :</th>
					<td><input type="text"  name="lname" value=<%=bean.getLastName()%>></td>
				<tr>
					<th>loginId :</th>
					<td><input type="text" name="loginId" value=<%= bean.getLoginId()%>></td>
				</tr>
				<tr>
					<th>password :</th>
					<td><input type="password" name="pwd" value= <%= bean.getPassword()%>></td>
				</tr>
				<tr>
				<th>mobileNumber:</th>
				<td><input type="text" name="mobile" value=<%=bean.getMobileNumber()%>></td>
				</tr>
				<tr>
				<td></td>
				<td><input type="submit" name="operation" value="update"></a>
			</table>
		</form>
	</center>
	<%}else{ %>
	
		<center>
		<form action="UserResgistrationCtl" method="post">
			<table>
				<tr>
					<th>firstName :</th>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<th>lastName :</th>
					<td><input type="text" name="lname"></td>
				<tr>
					<th>loginId :</th>
					<td><input type="text" name="loginId"></td>
				</tr>
				<tr>
					<th>password :</th>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
				<th>mobileNumber:</th>
				<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="operation" value="Add" ></td>
				</tr>
			</table>
		</form>
	</center>
	
	
	<%} %>
	<%@ include file="Footer.jsp"%>
</body>
</html>