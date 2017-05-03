<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mostraDati</title>
</head>
<body>
Nome:<%out.println(request.getAttribute("nome"));%>
Cognome:<%out.println(request.getAttribute("cognome"));%>
Indirizzo:<%out.println(request.getAttribute("address"));%>
Host:<%out.println(request.getAttribute("host"));%>
UserAgent:<%out.println(request.getAttribute("userAgent"));%>



</body>
</html>