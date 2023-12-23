<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>


<c:choose>
<c:when test="${ validation_final_data }">
<c:out value="bienvenue ${ nom }" />
</c:when>


<c:when test="${ empty validation_final_data }">
<c:out value="validation_final_data is empty" />
</c:when>


<c:otherwise>
<c:out value="verifier vos données : validation_final_data vaut ${ validation_final_data }" />
<c:out value="valeur envoyées : ${ nom } ${ email } ${ pass }" />
</c:otherwise>


</c:choose>


</p>
</body>
</html>