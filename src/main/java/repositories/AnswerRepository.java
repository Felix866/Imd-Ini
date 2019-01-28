package repositories;

import domain.Administrator;
import domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Integer>{
    @Query("select a from Answer a where a.id = ?1")
    Answer findOneToEdit(int answerId);
}
