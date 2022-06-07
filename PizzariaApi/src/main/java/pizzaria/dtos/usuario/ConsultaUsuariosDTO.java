package pizzaria.dtos.usuario;

public class ConsultaUsuariosDTO {
	
	private String email;
	private String nomePerfil;
	
	
	
	public ConsultaUsuariosDTO() {
	}
	public ConsultaUsuariosDTO(String email, String nomePerfil) {
		this.email = email;
		this.nomePerfil = nomePerfil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomePerfil() {
		return nomePerfil;
	}
	public void setNomePerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}

}


