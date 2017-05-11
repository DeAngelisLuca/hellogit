package it.uniroma3.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.it.model.Prodotto;
import it.uniroma3.service.ProductService;
import it.uniroma3.validator.ProductValidator;

public class ControllerProdotto extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String nextPage;
		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String prezzo = request.getParameter("prezzo");
		String dataScadenza = request.getParameter("dataScadenza");
//dovremmo avere una classe specifica per la conversione e non tutto insieme con validator
		ProductValidator validator = new ProductValidator();
		if(validator.validate(request)) {
			Prodotto prodotto = new Prodotto();
			prodotto.setNome(nome);
			prodotto.setPrezzo(Float.parseFloat(prezzo));
			prodotto.setDescrizione(descrizione);
			DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			prodotto.setDataScadenza(dateFormat.parse(dataScadenza));
			ProductService service = new ProductService();
			service.inserisciProdotto(prodotto);
			nextPage = "/MostraDati.jsp";
		}
		else{
			nextPage = "/index.jsp";
		}
		
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return; 
	}
}




