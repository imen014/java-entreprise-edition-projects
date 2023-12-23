package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GtaskServlet")
public class GtaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public GtaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/gestion_task.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		this.getServletContext().getRequestDispatcher("/WEB-INF/gestion_task.jsp").forward(request, response);

	}

}
