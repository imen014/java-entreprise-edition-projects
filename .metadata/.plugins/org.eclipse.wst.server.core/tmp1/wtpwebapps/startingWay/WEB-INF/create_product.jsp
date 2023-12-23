<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product Form</title>
</head>
<body>
<form action="CreateProductServlet" method="POST">

<label for="nom_produit"> Nom Produit </label>
<input type="text" name="nom_produit" required /> <br/>

<label for="quantite_stock"> Quantite Stock </label>
<input type="text" name="quantite_stock" required /> <br/>

<label for="price_product"> Prix </label>
<input type="text" name="price_product" required /> <br/>

<label for="code_produit"> Code à barre </label>
<input type="text" name="code_produit" required /> <br/>

<h2>Categorie_produit</h2>
<hr>

<label for="code_categorie"> Code Categorie </label>
<input type="text" name="code_categorie" required /> <br/>

<label for="nom_categorie"> Nom Categorie </label>
<input type="text" name="nom_categorie" required /> <br/>

<label for="quantite_stock">  Quantite stock </label>
<input type="text" name="quantite_stock" required /> <br/>

<input type="submit" name="Valider" />

</form>

<c:url var="ConsulterListeUser" value="/StartingWayServlet" />
<a href="${ConsulterListeUser}">Consulter Liste Utilisateurs</a>
</body>
</html>
