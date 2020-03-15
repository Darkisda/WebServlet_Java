package primeirosPassos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cadastrar
 */
@WebServlet("/Cadastrar")
public class Cadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Cadastrar() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nome = null;
		Integer idade = null;
		String email = null;
		String login = null;
		String senha = null;
		
		try {
			nome = request.getParameter("nome").toUpperCase();
			idade = Integer.parseInt(request.getParameter("idade"));
			email = request.getParameter("email").toUpperCase();
			login = request.getParameter("login").toUpperCase();
			senha = request.getParameter("senha").toUpperCase();
			
			response.getWriter().append(nome + idade + email + login + senha);
			
		} catch (Exception e ) {
			response.getWriter().append("Voce precisa preencher todos os campos");
		}
		
	}

}
