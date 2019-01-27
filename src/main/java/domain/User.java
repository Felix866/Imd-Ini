package domain;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Access(AccessType.PROPERTY)
public class User extends Actor {

    // Constructors ----------------------------------------------------------------------

    public User() { super();}

    // Attributes ------------------------------------------------------------------------


    // Relationships ----------------------------------------------------------------------

    private Collection<Problema> problemas;
    private Collection<Test> tests;

    @Valid
    @NotNull
    @OneToMany(mappedBy = "user")
    public Collection<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(Collection<Problema> problemas) {
        this.problemas = problemas;
    }

    @Valid
    @NotNull
    @OneToMany(mappedBy = "user")
    public Collection<Test> getTests() {
        return tests;
    }

    public void setTests(Collection<Test> tests) {
        this.tests = tests;
    }
}
