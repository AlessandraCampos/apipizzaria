package pizzaria.entities;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name= "tb_venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(pattern="dd/MM/yyyy 00:00")
	@Column(name="data")
	private LocalDateTime localDateTime;

	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	@Column(name= "valortotal")
	private float valorTotal = (float) 0.00;
	
	private String cep;
	
	@Transient
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return localDateTime;
	}

	public void setData(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
	
	public Venda(Usuario usuario) {
		this.usuario = usuario;
	}

	public Venda(LocalDateTime localDateTime, Usuario usuario, float valorTotal, String cep) {
		super();
		this.localDateTime = localDateTime;
		this.usuario = usuario;
		this.valorTotal = valorTotal;
		this.cep = cep;
	}

	public Venda() {
		// TODO Auto-generated constructor stub
	}
}

