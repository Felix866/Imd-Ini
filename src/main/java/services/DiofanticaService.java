package services;

import domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import repositories.DiofanticaRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class DiofanticaService {

    // Managed repository -----------------------------------------------------

    @Autowired
    private DiofanticaRepository diofanticaRepository;

    // Supporting services ----------------------------------------------------

    @Autowired
    private TeoriaService teoriaService;
    // Constructors -----------------------------------------------------------

    public DiofanticaService() { super(); }

    // Simple CRUD methods ----------------------------------------------------

    public Diofantica create() {
        Diofantica result;

        result = new Diofantica();

        return result;
    }

    public Diofantica findOne(final int diofanticaId) {

        Diofantica result;
        result = this.diofanticaRepository.findOne(diofanticaId);
        return result;
    }

    public Collection<Diofantica> findAll() {

        Collection<Diofantica> result;
        result = this.diofanticaRepository.findAll();
        return result;
    }

    public Diofantica save(Diofantica diofantica) {
        Assert.notNull(diofantica);
        Diofantica result;

        if(diofantica.getId()==0){
            result = diofanticaRepository.save(diofantica);
            result.setTeoria(teoriaService.findOneByTipo(diofantica.getTipos()));
        }else {
            result = this.diofanticaRepository.save(diofantica);
        }
        return result;
    }

    // Other business methods -----------------------------------------------------------------

}