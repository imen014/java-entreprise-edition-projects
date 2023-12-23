package com.j2e.exercices;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulaire_Connexion")
public class Formulaire_Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Formulaire_Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = (String) request.getParameter("username");
		String password = (String) request.getParameter("pass");
		
		request.setAttribute("nom", nom);
		request.setAttribute("password", password);
		
		
			this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
	}

}
