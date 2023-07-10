<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table>
			<jsp:useBean id="bean" class="in.co.rays.bean.UserBean"/>
		<%bean.setFirstName("harsh");%>
		<%bean.setLastName("patidar");%>
		<%bean.setLoginId("harshpatidar.234@gamail.com");%>
		<%bean.setPassword("harsh");%>
		<%bean.setMobileNumber("7747967076");%>
		
		
			<tr>
				<th>firstName :</th>
				<td><jsp:getProperty name="bean" property="firstName" /></td>


			</tr>
			<tr>
				<th>lastName :</th>
				<td><jsp:getProperty name="bean" property="lastName" /></td>
			<tr>
				<th>loginId :</th>
				<td><jsp:getProperty name="bean" property="loginId" /></td>
			</tr>
			<tr>
				<th>password :</th>
				<td><jsp:getProperty name="bean" property="password" /></td>
			</tr>
			<tr>
				<th>mobileNumber:</th>
				<td><jsp:getProperty name="bean" property="mobileNumber" /></td>
			</tr>
			
		</table>
	</center>

</body>
</html>