<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>c.jsp</title>
</head>
<body>
<%request.setAttribute("C", "Three"); 
  String a=(String)request.getAttribute("A");
  String b=(String)request.getAttribute("B");
  String c=(String)request.getAttribute("C");
%>

 <%=a%>
 <%=b%>
 <%=c%>

</body>
</html>