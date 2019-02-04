package repositories;

import domain.Teoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TeoriaRepository extends JpaRepository<Teoria,Integer>{
    @Query("select t from Teoria t where t.id = ?1")
    Teoria findOneToEdit(int teoriaId);

    @Query("Select t from Teoria t where t.tipo =?1")
    Teoria findOneByTipo(Collection<String> tipo);
}
