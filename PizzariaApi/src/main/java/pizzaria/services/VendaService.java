package pizzaria.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pizzaria.entities.Venda;
import pizzaria.repositories.VendaRepository;



@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public Venda salvarVenda(Venda venda) {
		
		return vendaRepository.save(venda);
		
		
	}
	
	public Optional<Venda> findById(Long id){
		try {
			Optional<Venda> idVenda = Optional.of(vendaRepository.findById(id).get());
			return idVenda;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
		
		
	}
	

}
