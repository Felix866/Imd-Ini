package services;

import domain.Problema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import repositories.ProblemaRepository;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class ProblemaService {

    // Managed repository -----------------------------------------------------

    @Autowired
    private ProblemaRepository problemaRepository;

    // Constructors -----------------------------------------------------------

    public ProblemaService() {
        super();
    }

    // Simple CRUD methods ----------------------------------------------------


    public Problema findOne(final int problemaId) {

        Problema result;
        result = this.problemaRepository.findOne(problemaId);
        return result;
    }

    public Collection<Problema> findAll() {

        Collection<Problema> result;
        result = this.problemaRepository.findAll();
        return result;
    }

    public Problema save(final Problema problema) {

        Assert.notNull(problema);

        Problema result;

        result = this.problemaRepository.save(problema);

        return result;
    }

    // Other business methods -------------------------------------------------

}