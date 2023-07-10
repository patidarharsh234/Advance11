<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="Myjsp.jsp">SimpleLink</a>



<%
  String enUrl=response.encodeURL("UserResgistration.jsp");
%>
<a href="<%=enUrl%>">EncodeLink</a>



<a href="Myjsp.jsp?jsessionid=<%=session.getId() %>">HumariLink</a>



<from action="SessTrackingCtl" method="get"><input type="button" value="submit">
<inpute type="hidden" name="jsessionid" value="<%=session.getId()%>"/>

</body>
</html>