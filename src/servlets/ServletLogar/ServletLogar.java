package servlets.ServletLogar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.UsuarioDAO.UsuarioDAO;

/**
 * Servlet implementation class ServletLogar
 */
@WebServlet("/ServletLogar")
public class ServletLogar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String l = request.getParameter("usuario");
		String s = request.getParameter("senha");
		
		System.out.println(l);
		System.out.println(s);
		
		UsuarioDAO dao = new UsuarioDAO();
		boolean retorno = dao.efetuarLogin(l, s);
		if(retorno){
			System.out.println("LOGADO");
		}else{
			System.out.println("Não logado");
		}
		
		
		
	}

}
