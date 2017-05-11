package it.uniroma3.validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

public class ProductValidator {
	
public boolean validate(HttpServletRequest request){
	boolean tuttoOk=true;
	String nome = request.getParameter("nome");
	String descrizione = request.getParameter("descrizione");
	String prezzo = request.getParameter("prezzo");
	String dataScadenza = request.getParameter("dataScadenza");
	String nextPage  = "/mostraDati.jsp";
	
	if(nome== null || nome.equals("")){
		//aggiungi nella risposta un parametro
		request.setAttribute("errNome" , "CAMPO OBBLIGATORIO");	
		tuttoOk=false;

		//questi errori vanno aggiunti nella form iniziale
	}
	if(descrizione == null || descrizione.equals("")){
		request.setAttribute("errDescrizione", "CAMPO OBBLIGATORIO");
		tuttoOk=false;
	}
	if(prezzo == null || prezzo.equals("")){
		request.setAttribute("errPrezzo", "CAMPO OBBLIGATORIO");
		tuttoOk=false;
	}
	if(dataScadenza == null || dataScadenza.equals("")){
		request.setAttribute("errDataScadenza", "CAMPO OBBLIGATORIO");
		tuttoOk=false;
	}
	
	
	try{
		Float.parseFloat(prezzo);
	}
	catch (NumberFormatException e) {
		request.setAttribute("errPrezzo", "Deve essere un numero!");
		tuttoOk = false;
	}
	try{
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		dateFormat.parse(dataScadenza);
	}
	catch (ParseException e) {
		request.setAttribute("errData", "Deve essere una data valida!");
		tuttoOk = false;
	}
	return tuttoOk;

	
}
}
