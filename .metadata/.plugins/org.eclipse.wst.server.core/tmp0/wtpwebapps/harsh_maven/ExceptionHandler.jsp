<%@ page isErrorPage="true" import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExceptionHandaling</title>
</head>
<body>

<font color="red"><%=exception.getMessage()%></font>

<%
StringWriter sw=new StringWriter();
PrintWriter pw=new PrintWriter(sw);

exception.printStackTrace(pw);
out.print("<!--"+sw+("-->"));
sw.close();
pw.close();
%>

</body>
</html>