package repositories;

import domain.Problema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemaRepository extends JpaRepository<Problema,Integer>{

}
