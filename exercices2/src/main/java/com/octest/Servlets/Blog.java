package com.octest.Servlets;
import com.octest.beans.My_Blog;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Blog")
public class Blog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Blog() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		My_Blog blog1 = new My_Blog();
		
		String tache1 = "tache une";
		String tache2 = "tache deux";
		String tache3 = "tache trois";
		
		
		blog1.ajouter_tache(tache1);
		blog1.ajouter_tache(tache2);
		blog1.ajouter_tache(tache3);
		
		blog1.supprimer_tache(tache3);
		
		ArrayList<String> maliste = blog1.retourner_tache();
		
		request.setAttribute("maliste", maliste);
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/traiter_blog.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		

		this.getServletContext().getRequestDispatcher("/WEB-INF/traiter_blog.jsp").forward(request, response);
	}

}
