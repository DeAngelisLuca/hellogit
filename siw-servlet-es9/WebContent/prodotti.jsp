<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Prodotti</title>
</head>
<body>
<!-- DEVO STAMPARE LA LISTA DEI PRODOTTI DENTRO LA RICHIESTA USANDO IL TAG DI ITERAZIONE-->
<ul>
	<c:forEach var="prodotto" items="${prodotti}">
	<li>${prodotto.nome}, ${prodotto.prezzo}</li>    <!-- nome e prezzo sono quelli della classe -->
	</c:forEach>
</ul>

</body>
</html>