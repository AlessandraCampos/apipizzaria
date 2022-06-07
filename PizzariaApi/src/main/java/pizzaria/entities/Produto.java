package pizzaria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="nome")
	private String nome;
    
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="unidmedida")
	private String unidadeMedida;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="preco")
	private float precoUnitario;
	
	@Column(name="quantestoque")
	private int quantidadeEmEstoque;
	
	public Produto() {
		
	}
	
	
	public Produto(String nome, String descricao, String unidadeMedida, String foto, float precoUnitario,
			int quantidadeEmEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.foto = foto;
		this.precoUnitario = precoUnitario;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		
	}

	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
