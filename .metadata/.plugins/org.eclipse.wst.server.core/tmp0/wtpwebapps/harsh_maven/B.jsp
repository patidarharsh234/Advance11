
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 	request.setAttribute("B", "Two");
	 %>
      <jsp:forward page="C.jsp"/>


</body>
</html>