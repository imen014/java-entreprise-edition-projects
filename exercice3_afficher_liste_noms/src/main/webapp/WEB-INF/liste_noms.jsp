<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher liste noms : </title>
<style type="text/css">
body {
background-color : blue;
}
text {
color : white;
}


</style>
</head>
<body>
<%
Integer visitCount = (Integer) session.getAttribute("visitCount");
out.println("nombre de visite : " + visitCount);
%>


</body>
</html>