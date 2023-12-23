<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<c:for var="i" begin="0" end="${texte_diviser.length}">
<c:out value="phrases possibles : ${texte_diviser[i]" />
</c:for>




</body>
</html>