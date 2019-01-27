package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Answer extends DomainEntity{

    // Constructors ----------------------------------------------------------------------

    public Answer() { super();}

    // Attributes ------------------------------------------------------------------------

    private Tipo title;
    private boolean correcta;

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public Tipo getTitle() {
        return title;
    }

    public void setTitle(Tipo title) {
        this.title = title;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    // Relationships ----------------------------------------------------------------------

    private Question question;

    @Valid
    @NotNull
    @ManyToOne(optional = false)
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
