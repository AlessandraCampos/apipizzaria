package pizzaria.dtos.produto;

import pizzaria.entities.Produto;



public class MapperProdutoDto {
	
	public static Produto fromDTO(RegistroProdutoDTO dto) {
		
		Produto produto = new Produto(
				dto.getNome(),
				dto.getDescricao(),
				dto.getUnidadeMedida(),
				dto.getFoto(),
				dto.getPrecoUnitario(),
				dto.getQuantidadeEmEstoque());
		return produto;
		
	}
	
	public static ConsultaProdutoDTO fromEntity(Produto produto) {
		
		ConsultaProdutoDTO produtoDto = new ConsultaProdutoDTO(
				produto.getId(),
				produto.getNome(),
				produto.getDescricao(),
				produto.getUnidadeMedida(),
				produto.getFoto(),
				produto.getPrecoUnitario(),
				produto.getQuantidadeEmEstoque()
				);
		
		return produtoDto;
	}
}
