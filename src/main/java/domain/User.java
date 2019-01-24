package domain;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class User extends Actor {

    // Constructors ----------------------------------------------------------------------

    public User() { super();}

    // Attributes ------------------------------------------------------------------------



    // Relationships ----------------------------------------------------------------------

    private Collection<EjercicioDiofantica> ejercicioDiofanticas;
    private Collection<Test> tests;

    @NotNull
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public Collection<EjercicioDiofantica> getEjercicioDiofanticas() {
        return ejercicioDiofanticas;
    }

    public void setEjercicioDiofanticas(Collection<EjercicioDiofantica> ejercicioDiofanticas) {
        this.ejercicioDiofanticas = ejercicioDiofanticas;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @NotNull
    public Collection<Test> getTests() {
        return tests;
    }

    public void setTests(Collection<Test> tests) {
        this.tests = tests;
    }
}
