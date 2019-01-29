package services;

import domain.Answer;
import domain.Question;
import domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import repositories.TestRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class TestService {

    // Managed repository -----------------------------------------------------

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private ActorService actorService;

    // Supporting services ----------------------------------------------------


    // Constructors -----------------------------------------------------------

    public TestService() {
        super();
    }

    // CRUD methods -----------------------------------------------------------

    public Test create(){
        Test test;

        test = new Test();
        test.setQuestions(new ArrayList<Question>());

        return test;
    }

    public Test save(Test test){
        Assert.notNull(test);
        return testRepository.save(test);
    }

    public void delete(Test test){
        Assert.isTrue(actorService.isAdministrator());
        questionService.deleteAll(test.getQuestions());
        testRepository.delete(test);
    }

    public Test findOne(int id){
        return testRepository.findOne(id);
    }

    public Collection<Test> findAll(){
        return testRepository.findAll();
    }

    public Test findOneToEdit(int testId) {
        Assert.notNull(testId);
        return testRepository.findOneToEdit(testId);
    }



    // Other business methods -------------------------------------------------

}
