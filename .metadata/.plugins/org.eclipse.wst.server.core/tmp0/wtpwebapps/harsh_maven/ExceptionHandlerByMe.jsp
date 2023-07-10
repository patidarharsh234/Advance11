<%@ page isErrorPage="true" import="java.io.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExceptionHandalingByMe</title>
</head>
<body>
<%
String message=null;
if(exception instanceof NumberFormatException){
	message="this is note a intiger number";
	
}else if(exception instanceof NullPointerException){
	message="value ko null mat chodo yarr";
}

%>
<font color="red"><%=message %></font>

</body>
</html>