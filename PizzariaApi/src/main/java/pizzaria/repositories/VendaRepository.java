package pizzaria.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pizzaria.entities.Venda;


@Repository
public interface VendaRepository extends JpaRepository <Venda, Long>{
	   Page<Venda>findAll(Pageable pageable);

}
