package domain;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class Test {

    // Constructors ----------------------------------------------------------------------

    public Test() {
        super();
    }

    // Attributes ------------------------------------------------------------------------

    private Collection<String> testQuestions;
    private Tipo tipo;

    public Collection<String> getTestQuestions() {
        return testQuestions;
    }

    public void setTestQuestions(Collection<String> testQuestions) {
        this.testQuestions = testQuestions;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    // Relationships ----------------------------------------------------------------------

    private Collection<String> questions;
    private User user;
    private Administrator administrator;

    @Valid
    @NotNull
    @OneToMany
    public Collection<String> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<String> questions) {
        this.questions = questions;
    }

    @Valid
    @ManyToOne(optional = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Valid
    @ManyToOne(optional = false)
    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
