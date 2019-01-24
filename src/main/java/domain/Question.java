package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class Question {

    // Constructors ----------------------------------------------------------------------

    public Question() { super();}

    // Attributes ------------------------------------------------------------------------

    private Collection<Tipo> tipo;
    private String title;

    public Collection<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(Collection<Tipo> tipo) {
        this.tipo = tipo;
    }

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Relationships ----------------------------------------------------------------------
    private Collection<Answer> answers;

    @Valid
    @NotNull
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    public Collection<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Collection<Answer> answers) {
        this.answers = answers;
    }
}
