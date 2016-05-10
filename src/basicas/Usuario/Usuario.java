package basicas.Usuario;

public class Usuario {

	private int codigo;
	private String login;
	private String nome;
	private String senha;
	private String email;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNoeme() {
		return nome;
	}
	public void setNoeme(String noeme) {
		this.nome = noeme;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Usuario(int codigo, String login, String nome, String senha, String email) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}
	
}
