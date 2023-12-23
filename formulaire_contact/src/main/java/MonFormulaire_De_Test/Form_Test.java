package MonFormulaire_De_Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Form_Test")
public class Form_Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Form_Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/mon_formulaire.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String username = (String) request.getParameter("username");
		String email = (String) request.getParameter("email");
		String message = (String) request.getParameter("message");
		String password = (String) request.getParameter("password");
		
		out.println("vous étes bien connecté " + username + " avec le mot de passe " + password + " votre email est " + email + " et vous avez laissé le message : " + message);

		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/mon_formulaire.jsp").forward(request, response);

	}

}
