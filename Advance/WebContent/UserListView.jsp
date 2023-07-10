<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
	
	<form action="UserListCtl.do" method="post">
	
	<%
		List list = (List) request.getAttribute("List");
		Iterator it = list.iterator();
	%>
	



	<table>
		<th>Name :</th>
		<td><input type="text" name="name"></td>
		<td><a href="UserListCtl.do" ><input type="submit" name="operation" value="search"></td>
		</a>
	</table>
	<table border="2" style="width: 1520px" cellpadding="5" cellspacing="5">
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>LoginId</th>
			<th>Password</th>
			<th>MobileNumber</th>
			<th>Edit</th>
		</tr>
		<%
			while (it.hasNext()) {
				UserBean bean1 = (UserBean) it.next();
		%>
		<tr>
			<td><%=bean1.getId()%></td>
			<td><%=bean1.getFirstName()%></td>
			<td><%=bean1.getLastName()%></td>
			<td><%=bean1.getLoginId()%></td>
			<td><%=bean1.getPassword()%></td>
			<td><%=bean1.getMobileNumber()%></td>
			<td><a href="UserResgistrationCtl?id=<%=bean1.getId()%>">Edit</a>
		</tr>
		<% 
			}
		%>
		
		


	</table>
	</form>

	<%@ include file="Footer.jsp"%>
</body>
</html>