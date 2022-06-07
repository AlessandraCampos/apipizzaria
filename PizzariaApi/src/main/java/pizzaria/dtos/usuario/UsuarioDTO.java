package pizzaria.dtos.usuario;

import pizzaria.entities.Perfil;



public class UsuarioDTO {
	

	private Long cpf;
	
	public UsuarioDTO(Long cpf, String email) {
	
		this.cpf = cpf;
		this.email = email;
	}
    
    private String nome;
    

	public UsuarioDTO(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String email;
	
	private String senha;
	
	private Perfil perfil;
	
	public UsuarioDTO() {
		
	}

	@SuppressWarnings("hiding")
	public <Perfil> UsuarioDTO( String email, String senha, pizzaria.entities.Perfil perfil) {
	
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}


	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	
	

}
