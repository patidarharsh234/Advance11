<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<%
		//	String name = (String) request.getAttribute("name");//-->req whitout session
		String name = (String) session.getAttribute("name");
	%>



	<table width="100%" border="0">
		<tr>
			<%
				if (name != null) {
			%>
			  
			<h3><b><a href="LoginCtl?operation=logout">LogOut</a> </h3><%
 	} else {
 %> <%
 	}
 %>
		</tr>
		
		<tr>
			<td width="90%"></td>
			<td rowspan="2">
				<h1 align="Right">
					<img src="img/Rays.jpg" height="100">
				</h1>
			</td>
		</tr>
		
		<tr>
			<td>
				<%
					if (name != null) {
				%>
				<h3>
					Hi,<%=name%></h3> <%
 	} else {
 %>

				<h3>hi,Gust</h3> <%
 	}
 %>
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<%
				if (name != null) {
			%>

			<td colspan="2"><b><a href="UserResgistrationCtl">Add
						User</a> | <a href="UserListCtl.do">User List</a></b></td>
			<%
				} else {
			%>
			<%
				}
			%>

		</tr>
	</table>
	<hr>
</body>
</html>