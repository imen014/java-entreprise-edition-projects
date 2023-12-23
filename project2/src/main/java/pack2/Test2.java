package pack2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String[] titres = {"nouvel incendie", "ile de waaard", "chute de dollar"};
		request.setAttribute("titres" , titres);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test2.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
