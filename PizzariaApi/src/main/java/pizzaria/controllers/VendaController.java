package pizzaria.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pizzaria.dtos.produto.ProdutoDTO;
import pizzaria.dtos.produto.VendaDTO;

import pizzaria.entities.ItemVenda;
import pizzaria.entities.Produto;
import pizzaria.entities.Usuario;
import pizzaria.entities.Venda;
import pizzaria.services.ItemVendaService;
import pizzaria.services.ProdutoService;
import pizzaria.services.UsuarioService;
import pizzaria.services.VendaService;

@CrossOrigin()
@RestController
@RequestMapping("/pedido")
public class VendaController {

	@Autowired
	private VendaService vendaService;
	@Autowired
	private ItemVendaService itemVendaService;	
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private UsuarioService usuarioService;
	


	@PostMapping("/finalizar")
	public  ResponseEntity<VendaDTO> novoPedido(@RequestBody VendaDTO vendaDTO) {
		Venda vendaNova = new Venda();
		vendaNova.setData(LocalDateTime.now());
		vendaNova.setUsuario(new Usuario(vendaDTO.getUsuarioDTO().getCpf()));
		vendaNova.setValorTotal(vendaDTO.getValorTotal());
		vendaNova.setCep(vendaDTO.getCep());
		vendaNova = vendaService.salvarVenda(vendaNova);
		
		for(ProdutoDTO item:vendaDTO.getItens()){		
			ItemVenda itemNovo = new ItemVenda();
			itemNovo.setVenda(vendaNova);
			Produto produto = produtoService.buscarUmProduto(item.getId());
			itemNovo.setProduto_id(produto);
			itemNovo.setQuantidade(item.getQuantidadeComprada());
			itemNovo.setValorunitario(produto.getPrecoUnitario());
			itemNovo.setValortotal(produto.getPrecoUnitario() * item.getQuantidadeComprada());
			itemVendaService.adicionarItem(itemNovo);
		}
		
		
		Usuario user = usuarioService.finduserById(vendaDTO.getUsuarioDTO().getCpf()); 
		vendaDTO.getUsuarioDTO().setEmail(user.getEmail());
		vendaDTO.getUsuarioDTO().setNome(user.getNome());
		return ResponseEntity.ok(vendaDTO);

	}
}
