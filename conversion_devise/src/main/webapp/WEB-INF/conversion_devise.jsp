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
 Double resultat = (Double) request.getAttribute("resultat");


if(resultat != null){
	out.println("la resultat de conversion est : " + resultat);

}else{
	out.println("verifier le montant ou l'unité ");

}

%>


<form method="POST" action="Convert_Devise">

<label for = "montant">Montant à convertir</label>
<input type="text" name="montant" />

<label for = "unitee">Unité de conversion : </label>
<input type="text" name="unitee" />

<input type="submit" />


</form>

</body>
</html>