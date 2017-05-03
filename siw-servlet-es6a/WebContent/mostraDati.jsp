<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mostraDati</title>
</head>
<body>
<%String nome = request.getParameter("nome").toUpperCase(); %>
<%String cognome = request.getParameter("cognome").toUpperCase(); %>
<%String address = request.getParameter("address"); %>
<%String host = request.getParameter("host"); %>
<%String userAgent = request.getParameter("userAgent"); %>


NOME:<% out.println(nome);%>
COGNOME:<% out.println(cognome);%>
ADDRESS:<% out.println(address);%>
HOST:<% out.println(host);%>
USER:<% out.println(userAgent);%>

</body>
</html>