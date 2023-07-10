
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seam Name</title>
</head>
<body>
	<center>
		<jsp:useBean id="bean" class="in.co.rays.bean.UserBean" />

		<jsp:setProperty name="bean" property="*" />

		<form action="jSPNameSeamUserBeanName.jsp">
			<%
				String op = request.getParameter("operation");
			%>
			<%
				if (op == null) {
			%>
			<table>

				<tr>
					<th>firstName :</th>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<th>lastName :</th>
					<td><input type="text" name="lastName"></td>
				<tr>
					<th>loginId :</th>
					<td><input type="text" name="loginId"></td>
				</tr>
				<tr>
					<th>password :</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<th>mobileNumber:</th>
					<td><input type="text" name="mobileNumber"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="operation" value="Add"></td>
				</tr>

			</table>
			<%
				}
			%>
		</form>
		<table>


			<%
				if (op != null) {
			%>
			<%=bean.getFirstName()%>
			<%=bean.getLastName()%>
			<%=bean.getLoginId()%>
			<%=bean.getPassword()%>
			<%=bean.getMobileNumber()%>
			<%
				}
			%>
		</table>
	</center>

</body>
</html>