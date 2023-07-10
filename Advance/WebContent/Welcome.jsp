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
     String fname=request.getParameter("fname");    //jspToJsp
       String lname =request.getParameter("lname");
       String loginid=request.getParameter("loginid");
       String pwd=request.getParameter("pwd");
          
           %>
           <%=fname %>
           <%=lname %>
           <%=loginid%>
           <%=pwd%>

</body>
</html>