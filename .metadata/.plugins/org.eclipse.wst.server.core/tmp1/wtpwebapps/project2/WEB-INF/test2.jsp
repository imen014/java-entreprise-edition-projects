<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forTokens var="morceau" items="Un element/Encore un element/un autre element dans la route" delims="/ ">

<p>${  morceau }</p>


</c:forTokens>


</body>
</html>