package repositories;

import domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test,Integer>{
    @Query("select t from Test t where t.id = ?1")
    Test findOneToEdit(int testId);
}
