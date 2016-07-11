package AdicionarUsuarioServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basicas.Usuario.Usuario;

@WebServlet("/adicionarUsuario")
public class adicionarUsuario extends HttpServlet {
 
	
	protected void service(HttpServletRequest request, HttpServletResponse response )
	throws ServletException, IOException{
		
		String login = request.getParameter("login");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String senhaConfirma = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senhaConfirma);
		
		
		
	}
	

}