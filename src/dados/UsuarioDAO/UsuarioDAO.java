package dados.UsuarioDAO;

import basicas.Usuario.Usuario;

public class UsuarioDAO {
	
	public void inserirUsuario(Usuario u){
		
	}
	public Usuario pesquisarUsuario(String login){
		return null;
		
	}
	public boolean efetuarLogin(String login, String senha){
		
		if(login.equals(senha)){
			return true;
		}else{
		return false;
		}
	}
}
