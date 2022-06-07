package pizzaria.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import pizzaria.entities.Produto;
import pizzaria.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	
	private ProdutoRepository produtoRepository;
	
	public ProdutoService (ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
		
	}
	
	public Produto cadastrarProduto(Produto produto ) {
	return	produtoRepository.save(produto);
		
	}
	
	
	public Produto buscarUmProduto (Long id) {
		
		Optional<Produto> buscarPorId = produtoRepository.findById(id);
		
		return buscarPorId.get();	
		
	}
	
	public Page<Produto> buscarTodosProdutos(Pageable pageable){
		
		return produtoRepository.findAll(pageable);
		
		
	}
	
	
	public Produto alterarProduto(Produto produto) {
		
		//Long idProduto = produto.getId();
		
		produtoRepository.save(produto);
		
		return produto;
		
		
	}

	

	
	

}
