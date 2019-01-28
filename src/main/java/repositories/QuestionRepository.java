package repositories;

import domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer>{
    @Query("select q from Question q where q.id =?1")
    Question findOneToEdit(int questionId);
}
