package repositories;

import domain.Diofantica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiofanticaRepository extends JpaRepository<Diofantica,Integer>{
}
