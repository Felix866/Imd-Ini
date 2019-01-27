package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;


@Entity
@Access(AccessType.PROPERTY)
public class Administrator extends Actor{

    // Constructors

    public Administrator() {
        super();
    }

    // Relationships ----------------------------------------------------------

    private Collection<Test> tests;

    @Valid
    @NotNull
    @OneToMany(mappedBy = "administrator")
    public Collection<Test> getTests() {
        return tests;
    }

    public void setTests(Collection<Test> tests) {
        this.tests = tests;
    }
}
