<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Search" method="POST">

<label for="texte_rechercher">texte à rechercher : </label>
<input type="text" name="texte_rechercher" id="texte_rechercher" />

<label for="texteObtenu">texte de recherche : </label>
<textArea name="texteObtenu" rows="5" cols="40"></textArea>


<input type="submit" />



</form>

</body>
</html>