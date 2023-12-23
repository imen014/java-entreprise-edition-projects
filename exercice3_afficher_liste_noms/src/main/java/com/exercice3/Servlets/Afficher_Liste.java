package com.exercice3.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Afficher_Liste")
public class Afficher_Liste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Afficher_Liste() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession();

		
		Integer visitCount = (Integer) session.getAttribute("visitCount");
		
		if(visitCount == null) {
			visitCount = 1;
		}else {
			visitCount += 1;
			session.setAttribute("visitCount", visitCount);
		}

		session.setAttribute("visitCount", visitCount);

		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/liste_noms.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
