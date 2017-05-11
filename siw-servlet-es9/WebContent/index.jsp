<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuovo Prodotto</title>
</head>
<body>
	<form action="prodotto" method="get">
		<div>
			Nome*:<input type="text" name="nome" value='${nome}' />
			 ${errNome}
		</div>
		<div>
			Descrizione*:<input type="text" name="descrizione"
				value='${descrizione}'> ${errDescrizione}
		</div>
		<div>
			Prezzo*:<input type="text" name="prezzo" value='${prezzo}'>
			${errPrezzo}
		</div>
		<div>
			Data scadenza*:<input type="text" name="dataScadenza"
				value='${dataScadenza}'> ${errDataScadenza}
		</div>
		<div>* Campo Obbligatorio!
		</div>
		<input type="submit" name="submit" value="spedisci" />
	</form>

</body>
</html>