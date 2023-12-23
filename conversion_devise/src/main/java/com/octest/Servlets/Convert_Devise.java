package com.octest.Servlets;
import com.octest.beans.ConversionDevise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Convert_Devise")
public class Convert_Devise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Convert_Devise() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/conversion_devise.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double montant = Double.parseDouble(request.getParameter("montant"));
		String unitee = request.getParameter("unitee");
		PrintWriter out = response.getWriter();
		
		ConversionDevise conversion1 = new ConversionDevise(montant, unitee);
		double resultat = conversion1.convertir();
		
		request.setAttribute("resultat", resultat);
		
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/conversion_devise.jsp").forward(request, response);

		
	}

}
