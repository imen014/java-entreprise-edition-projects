package com.octest.Servlets;
import com.octest.beans.Outil_Recherche;
import java.util.ArrayList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire_recherche.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String mot = request.getParameter("mot");
		String texteObtenu = request.getParameter("texteObtenu");

		
		Outil_Recherche recherche1 = new Outil_Recherche(texteObtenu, mot);
		String[] texte_diviser = recherche1.diviser_texte();
		ArrayList<String> liste_resultante = recherche1.retourner_chaines_possibles();
		
		request.setAttribute("liste_resultante", liste_resultante);
		request.setAttribute("texte_diviser", texte_diviser);

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/resultat_recherche.jsp").forward(request, response);

	}

}
