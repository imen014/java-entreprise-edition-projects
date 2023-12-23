<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tasks</title>
</head>
<body>
<form action="GtaskServlet" method="POST">

<label for="saisi_task">  Tâche </label>
<input type="text" name="saisi_task" id="saisi_task" />

<label for="state_task"> État </label>
<input type="text" name="state_task" id="state_task" />

<input type="submit" value="Valider" />
</form>
</body>
</html>