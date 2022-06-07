package pizzaria.dtos.produto;

import java.util.List;

import pizzaria.dtos.usuario.UsuarioDTO;



public class VendaDTO {
	
	private UsuarioDTO usuarioDTO;
	private String cep;
	private float valorTotal;	
	private List<ProdutoDTO> itens;
	
	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}
	public void setUsuario(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;	
	}	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<ProdutoDTO> getItens() {
		return itens;
	}
	public void setItens(List<ProdutoDTO> itens) {
		this.itens = itens;
	}
	
	public VendaDTO(UsuarioDTO usuarioDTO, String cep, float valorTotal, List<ProdutoDTO> itens) {
		this.usuarioDTO =usuarioDTO;
		this.cep = cep;
		this.valorTotal = valorTotal;
		this.itens = itens;
	}


	
	

}
