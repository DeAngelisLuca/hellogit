package it.uniroma3.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/processa")
public class MostraParametriRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// gestione della RICHIESTA

		// leggo e manipolo i parametri
		String nome = request.getParameter("nome").toUpperCase();
		String cognome = request.getParameter("cognome").toUpperCase();//usava matricola
		//devo verificare che nome sia String not null e Matricola numeri not null
		//se cosi' non fosse ripresento la form iniziale con i campi gia' compilati
		
		// metto i valori nella sessione
		HttpSession session = request.getSession();
		session.setAttribute("nome", nome);
		session.setAttribute("cognome", cognome);

		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/mostraDati.jsp");
		rd.forward(request, response);
		return; 
	}
}

