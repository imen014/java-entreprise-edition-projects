package com.octest.Servlets;
import com.octest.beans.ValidationLogin;
import javax.servlet.http.Cookie;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/Traiter_Formulaire")
public class Traiter_Formulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Traiter_Formulaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nom = (String) request.getParameter("nom");
		String prenom = (String) request.getParameter("prenom");
		String email = (String) request.getParameter("email");
		String pass = (String) request.getParameter("pass");

		
		
		HttpSession session = request.getSession();
		session.setAttribute("nom", nom);
		session.setAttribute("pass", pass);
		
		request.setAttribute("nom", nom);
		request.setAttribute("email", email);
		request.setAttribute("pass", pass);

		
		
		ValidationLogin valide_data = new ValidationLogin(nom, pass, email);
		boolean validation_final_data = valide_data.validation_main();
		request.setAttribute("validation_final_data", validation_final_data);
		
		
		
		Cookie mon_cookie = new Cookie("nom", nom);
		response.addCookie(mon_cookie);




		
		this.getServletContext().getRequestDispatcher("/WEB-INF/traiter_form.jsp").forward(request, response);
	}

}
