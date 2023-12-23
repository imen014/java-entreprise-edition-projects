<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String Message = (String) request.getAttribute("variable");
out.println(Message);
out.println("count to ten !");

%>
<%@
include file="menu2.jsp"
 %>
</body>
</html>