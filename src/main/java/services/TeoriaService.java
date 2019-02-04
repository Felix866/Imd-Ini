package services;

import domain.Teoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import repositories.TeoriaRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class TeoriaService {
    // Managed repository -----------------------------------------------------

    @Autowired
    private TeoriaRepository teoriaRepository;
    @Autowired
    private ActorService actorService;

    // Supporting services ----------------------------------------------------


    // Constructors -----------------------------------------------------------

    public TeoriaService() {
        super();
    }

    // CRUD methods -----------------------------------------------------------

    public Teoria create(){
        Teoria teoria;

        teoria = new Teoria();
        teoria.setPdf(new ArrayList<String>());

        return teoria;
    }

    public Teoria save(Teoria teoria){
        Assert.notNull(teoria);
        return teoriaRepository.save(teoria);
    }

    public void delete(Teoria teoria){
        Assert.isTrue(actorService.isAdministrator());
        teoriaRepository.delete(teoria);
    }

    public Teoria findOneToEdit(int id){
        return teoriaRepository.findOneToEdit(id);
    }

    public Collection<Teoria> findAll(){
        return teoriaRepository.findAll();
    }

    // Other business methods -------------------------------------------------

    public Teoria findOneByTipo(Collection<String> tipo){
        return teoriaRepository.findOneByTipo(tipo);
    }
}