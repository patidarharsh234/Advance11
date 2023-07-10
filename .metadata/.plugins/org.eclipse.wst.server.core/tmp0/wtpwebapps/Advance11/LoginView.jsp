<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginCtl" method="post">


		<%@ include file="Header.jsp"%>

		<center>
			<h1>Login</h1>
			<H2>
				<%
					String error = (String) request.getAttribute("error");
					//	String error = (String) session.getAttribute("error");
					String msg = (String) request.getAttribute("msg");
					String uri = (String) request.getAttribute("uri");
					String success = (String) request.getAttribute("success");
					String requ1 = (String) request.getAttribute("requ1");
					String requ2 = (String) request.getAttribute("requ2");
				%>

				<%
					if (success != null) {
				%>
				<h3>
					<font color="green"> <%=success%></font>
				</h3>

				<%
					}
				%>


				<%
					if (msg != null) {
				%>
				<h3>
					<font color="red"><%=msg%></font>
				</h3>
				<%
					}
				%>



				<%
					if (error != null) {
				%>
				<h1>
					<form color="red"><%=error%></form>
				</h1>
	

	<%
		} else {
	%>
	<h1>Login user email&password</h1>

	<%
		}
	%>

	




	<table>
		<tr>
			<th>LoginId*</th>
			<td><input type="text" name="login" size=30 value="">
			<td>
				<%
					if (requ1 != null) {
				%>
				<h3>
					<font color="red"><%=requ1%>
				</h3> <%
 	}
 %>
			</td>
		</tr>


		<tr>
			<th>Password*</th>
			<td><input type="password" name="password" size=30 value="">
			<td>
				<%
					if (requ2 != null) {
				%>

				<h3>
					<font color="red"><%=requ2%>
				</h3> <%
 	}
 %>
			</td>
		</tr>




		<tr>
			<th></th>
			<td colspan="2"><a href="LoginCtl"><input type="submit"
					name="operation" value="SignIn"></a> <a href="LoginCtl"><input
					type="submit" name="operation" value="SignUp"></a></td>
		</tr>

	</table>



	<input type="hidden" name="uri" value="<%=uri%>">
	</form>
	</center>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


	<%@ include file="Footer.jsp"%>
</body>
</html>