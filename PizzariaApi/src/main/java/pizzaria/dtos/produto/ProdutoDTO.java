package pizzaria.dtos.produto;

public class ProdutoDTO {

	private Long Id;

	private String nome;

	private String descricao;

	private String unidadeMedida;

	private String foto;

	private float precoUnitario;

	private int quantidadeEmEstoque;
	
	private int quantidadeComprada;
	

	public ProdutoDTO(String nome, String descricao, String unidadeMedida, String foto, float precoUnitario,
			int quantidadeEmEstoque, int quantidadeComprada) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.foto = foto;
		this.precoUnitario = precoUnitario;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.quantidadeComprada = quantidadeComprada;
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
	
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

}
