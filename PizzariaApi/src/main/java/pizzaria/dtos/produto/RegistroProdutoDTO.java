package pizzaria.dtos.produto;

public class RegistroProdutoDTO {
	

	private String nome;

	private String descricao;
	
	private String unidadeMedida;

	private String foto;

	private float precoUnitario;

	private int quantidadeEmEstoque;

	public RegistroProdutoDTO( String nome, String descricao, String unidadeMedida, String foto,
			float precoUnitario, int quantidadeEmEstoque) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.foto = foto;
		this.precoUnitario = precoUnitario;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public RegistroProdutoDTO() {
	
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

}


