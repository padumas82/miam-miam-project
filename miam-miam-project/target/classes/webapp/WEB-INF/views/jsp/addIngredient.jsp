<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Index page</title>
</head>
<body>
<h2>To add new person</h2>

<form:form modelAttribute="ingredient" action= "confirmAjoutIngredient" method="post">
<form:label path="nom_ingredient">Désignation</form:label>
<form:input path="nom_ingredient"/>
<form:label path="prix_ingredient">Prix</form:label>
<form:input path="prix_ingredient" />
<input type="submit" value="Ajouter"/>
</form:form>
</body>
</html>