package pizzaria.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pizzaria.entities.ItemVenda;
import pizzaria.repositories.ItemVendaRepository;


@Service
public class ItemVendaService {
	
	@Autowired
	private ItemVendaRepository itemVendaRepository;
	
	
	public ItemVenda adicionarItem(ItemVenda item) {		
		return itemVendaRepository.save(item);
		
	}

}





