package com.octest.Servlets;
import com.octest.beans.Gestionnaire_de_taches;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Gestion_Taches")
public class Gestion_Taches extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Gestion_Taches() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/gestion_taches.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String tache = (String) request.getParameter("tache");
		String tache1 = "tache une";
		String tache2 = "tache deux";
		String tache3 = "tache trois";
		Gestionnaire_de_taches gestionnaire1 = new Gestionnaire_de_taches(tache1);
		gestionnaire1.ajouter_taches(tache1);
		gestionnaire1.ajouter_taches(tache2);
		gestionnaire1.ajouter_taches(tache3);

		
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/gestion_taches.jsp").forward(request, response);

	}

}
