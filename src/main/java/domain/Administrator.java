package domain;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class Administrator extends Actor{

    // Constructors

    public Administrator() {
        super();
    }

    // Relationships ----------------------------------------------------------

    private Collection<Test> tests;

    @OneToMany(mappedBy = "administrator", cascade = CascadeType.ALL)
    @NotNull
    @Valid
    public Collection<Test> getTests() {
        return tests;
    }

    public void setTests(Collection<Test> tests) {
        this.tests = tests;
    }

}
