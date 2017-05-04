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
		String cognome = request.getParameter("cognome").toUpperCase();
		String nextPage ;
		
		request.setAttribute("nome", nome);
		request.setAttribute("cognome", cognome);
		//devo verificare che nome sia String not null e Matricola numeri not null
		//se cosi' non fosse ripresento la form iniziale con i campi gia' compilati
		//se questo caso va bene la prox pagina deve essere quella MostraDati.jsp
		//altrimenti la form iniziale
		if(nome!=null && cognome!=null && !nome.equals("") && !cognome.equals("")){
			nextPage = "/mostraDati.jsp";
			//request.setAttribute("nome", nome);
			//request.setAttribute("cognome", cognome);
		
		}
		//se non si verifica
		else{//se non e' stato inserito o non e' arrivato il parametro nome
			if(nome== null || nome.equals("")){
				//aggiungi nella risposta un parametro
				request.setAttribute("errNome" , "CAMPO OBBLIGATORIO");	

				//questi errori vanno aggiunti nella form iniziale
			}
			if(cognome == null || cognome.equals("")){
				request.setAttribute("errCognome", "CAMPO OBBLIGATORIO");
			}

			nextPage = "/index.jsp";
		}
		
		// inoltro
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return; 
	}
}

