package pizzaria.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pizzaria.entities.ItemVenda;


@Repository
public interface ItemVendaRepository extends JpaRepository <ItemVenda,Long>{
	
	Page<ItemVenda>findAll(Pageable pageable);

}


