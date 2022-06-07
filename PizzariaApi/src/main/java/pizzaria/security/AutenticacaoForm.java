package pizzaria.security;

public class AutenticacaoForm {
	
	private String username;
	
	private String senha;
	
	private String token;
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AutenticacaoForm() {

	}

	public AutenticacaoForm(String username, String senha) {
		this.username = username;
		this.senha = senha;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	



}
