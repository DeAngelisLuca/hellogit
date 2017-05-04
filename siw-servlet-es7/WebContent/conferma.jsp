<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dati Confermati</title>
</head>
<body>
Hai inserito i seguenti dati nella form
<div>Nome:<%out.println(session.getAttribute("NOME"));%></div>
<div>Cognome:<%out.println(session.getAttribute("NOME"));%></div>

</body>
</html>