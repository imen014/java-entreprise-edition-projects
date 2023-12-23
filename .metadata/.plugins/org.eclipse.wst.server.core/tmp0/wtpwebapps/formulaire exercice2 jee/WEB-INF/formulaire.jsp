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
String nom = (String) request.getAttribute("nom");
String password = (String) request.getAttribute("password");

if(nom != null && password != null){
		out.println("you are connected !");
}else{
	out.println("Identifiants Invalides !");
}



%>


<form action="formulaire_de_connexion" method="POST">
<label for="username"> Username : </label>
<input type="text" id="username" name="username" />

<label for="pass">password : </label>
<input type="password" id="pass" name="pass" />

<input type="submit" />



</form>

</body>
</html>