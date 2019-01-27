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

    private Collection<Diofantica> diofanticas;
    private Collection<Test> tests;

    @Valid
    @NotNull
    @OneToMany(mappedBy = "user")
    public Collection<Diofantica> getDiofanticas() {
        return diofanticas;
    }

    public void setDiofanticas(Collection<Diofantica> diofanticas) {
        this.diofanticas = diofanticas;
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
