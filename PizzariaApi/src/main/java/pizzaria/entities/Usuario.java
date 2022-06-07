package pizzaria.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	private Long cpf;

	private String nome;

	private String email;

	private String senha;
    
	
	@ManyToOne
	@JoinColumn(name = "perfil_id", referencedColumnName = "id")
	private Perfil perfil;

	public Usuario() {

	}

	public Usuario(Long cpf, String nome, String email, String senha, Perfil perfil) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}
	

	public Usuario(Long cpf2) {
		this.cpf = cpf2;
	}

	public Usuario(String email) {
		this.email = email;
		
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
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

	@OneToOne(cascade = { CascadeType.ALL })
	public Perfil getPerfil() {
		return (Perfil) perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return (Collection<? extends GrantedAuthority>) List.of(this.perfil);
	}

	@Override
	public String getPassword() {

		return this.senha;
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", email=" + email + ", perfil=" + perfil + "]";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.email;
	}

}
