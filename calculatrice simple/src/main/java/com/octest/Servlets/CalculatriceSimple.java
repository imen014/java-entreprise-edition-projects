package com.octest.Servlets;
import com.octest.beans.CalculSimple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CalculatriceSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CalculatriceSimple() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		float number1 = Float.parseFloat(request.getParameter("number1"));
		float number2 = Float.parseFloat(request.getParameter("number2"));
		String operator = (String) request.getParameter("operator");
		
		CalculSimple calcul1 = new CalculSimple(number1, number2, operator);
		float resultat = calcul1.calcul();
		
		request.setAttribute("resultat", resultat);
		
		//PrintWriter out = response.getWriter();
		//out.println("la resultat de votre calcul est : " + resultat);
		
		

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}

}
