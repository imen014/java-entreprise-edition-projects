<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>vous étes sur autre.jsp</p>

<c:if test="${  !empty sessionScope.prenom && !empty sessionScope.nom }">
<p>  vous étes ${ sessionScope.prenom } ${ sessionScope.nom } </p>
</c:if>



</body>
</html>