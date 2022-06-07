package pizzaria.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pizzaria.dtos.produto.ConsultaProdutoDTO;
import pizzaria.dtos.produto.MapperProdutoDto;
import pizzaria.dtos.produto.RegistroProdutoDTO;

import pizzaria.entities.Produto;
import pizzaria.services.ProdutoService;


@CrossOrigin()
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
@Autowired
private ProdutoService produtoService;
	

     @PostMapping("/cadastrar")
      public ResponseEntity<ConsultaProdutoDTO> cadastrarProduto(@RequestBody RegistroProdutoDTO produtoDTO){
    	  
    	  Produto produto = produtoService.cadastrarProduto(MapperProdutoDto.fromDTO(produtoDTO));
    	  
    	  return ResponseEntity.ok(MapperProdutoDto.fromEntity(produto));
    	  
 }

     
 	@RequestMapping(produces = "application/json")
 	public ResponseEntity<Page<ConsultaProdutoDTO>> listarProdutos(@PageableDefault Pageable pageable){
 		return ResponseEntity.ok(produtoService.buscarTodosProdutos(pageable).map(MapperProdutoDto::fromEntity));
	
 	}

}
