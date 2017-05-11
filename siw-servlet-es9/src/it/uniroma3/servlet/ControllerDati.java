package it.uniroma3.servlet;


import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.it.model.Prodotto;

@WebServlet("/prodotto")
public class ControllerDati extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
	
		List<Prodotto> prodotti = new ArrayList<>();
		Prodotto prodotto1 = new Prodotto();
		prodotto1.setNome("penna");
		prodotto1.setPrezzo(3F);
		prodotti.add(prodotto1);
		Prodotto prodotto2 = new Prodotto();
		prodotto2.setNome("gomma");
		prodotto2.setPrezzo(1F);
		prodotti.add(prodotto2);
		Prodotto prodotto3 = new Prodotto();
		prodotto3.setNome("matita");
		prodotto3.setPrezzo(5F);
		prodotti.add(prodotto3);
		
		request.setAttribute("prodotti", prodotti);
		
		
		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/prodotti.jsp");
		rd.forward(request, response);
		return; 
	}
}

