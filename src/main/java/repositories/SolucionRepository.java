package repositories;

import domain.Solucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SolucionRepository extends JpaRepository<Solucion,Integer>{
    @Query("select t from Solucion t where t.id = ?1")
    Solucion findOneToEdit(int solucionId);
}
