package services;

import domain.Solucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import repositories.SolucionRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class SolucionService {
    // Managed repository -----------------------------------------------------

    @Autowired
    private SolucionRepository solucionRepository;
    @Autowired
    private ActorService actorService;

    // Supporting services ----------------------------------------------------


    // Constructors -----------------------------------------------------------

    public SolucionService() {
        super();
    }

    // CRUD methods -----------------------------------------------------------

    public Solucion create(){
        Solucion solucion;

        solucion = new Solucion();

        return solucion;
    }

    public Solucion save(Solucion solucion){
        Assert.notNull(solucion);
        return solucionRepository.save(solucion);
    }

    public Solucion findOneToEdit(int id){
        return solucionRepository.findOneToEdit(id);
    }

    public Collection<Solucion> findAll(){
        return solucionRepository.findAll();
    }

    // Other business methods -------------------------------------------------
}