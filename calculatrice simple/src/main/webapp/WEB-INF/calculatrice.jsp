<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
float resultat = (float) request.getAttribute("resultat");
out.println(resultat);



%>


<body>
<form method="POST" action="CalculatriceSimple">

<label for="number1">Entrer_un_nombre</label>
<input type="text" name="number1" id="number1" />

<label for="number2">Entrer_un_autre_nombre</label>
<input type="text" name="number2" id="number2" />

<label for="operator">operator</label>
<input type="text" name="operator" id="operator" />

<input type="submit"  />



</form>

</body>
</html>