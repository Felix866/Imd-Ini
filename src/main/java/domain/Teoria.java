package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Access(AccessType.PROPERTY)
public class Teoria extends DomainEntity{

    // Constructors ----------------------------------------------------------------------

    public Teoria() { super();}

    // Attributes -------------------------------------------------------------------------

    private String tipo;
    private Collection<String> pdf;

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @URL
    @NotBlank
    @ElementCollection
    public Collection<String> getPdf() {
        return pdf;
    }

    public void setPdf(Collection<String> pdf) {
        this.pdf = pdf;
    }

    // Relationships ----------------------------------------------------------------------

    private Problema problema;

    @Valid
    @NotNull
    @OneToOne(optional = false)
    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }
}
