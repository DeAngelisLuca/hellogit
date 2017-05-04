
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Prima pagina</title>
</head>
<body>
	<form action="processa" method="get">
		<div>
			Nome: <input type="text" name="nome" 
			value="<% if(request.getParameter("nome")!=null) out.println(request.getParameter("nome")); %>" />
			<% if(request.getAttribute("errNome") != null 
			out.print(request.getAttribute("errNome")); %>
			
			PER SEMPLIFICARE USIAMO LE ESPRESSIONI CHE VIENE STAMPATO SOLO SE IL VALORE E' DIVERSO DA NULL
			NON FUNZIONA LUNEDI' LO SISTEMIAMO
			value="${request.getParameter("nome")}" />
			${request.getParameter("errCognome")}
			MOLTO PIU' SEMPLICE DA LEGGERE ANALOGO PER COGNOME
		</div>
		<div>
			Cognome: <input type="text" name="cognome"
			 value="<% if(request.getParameter("cognome") != null ) out.println(request.getParameter("cognome")); %>/>
			
		</div>
		
		<input type="submit" name="sumbit" value="invia" />
	</form>
</body>
</html>