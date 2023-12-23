<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="${ prenom }" />


<c:if test="${  !empty sessionScope.prenom && !empty sessionScope.nom }">
<p>  vous étes ${ sessionScope.prenom } ${ sessionScope.nom } </p>
</c:if>





<form action="formulaire_demonstration" method="POST">
<p>
<label for="nom">Nom : </label>
<input type="text" id="nom" name="nom" />
</p>

<p>
<label for="prenom"> Prenom : </label>
<input type="prenom" id="prenom" name="prenom" />
</p>

<input type = "submit" />
</form>





</body>
</html>