package domain;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Teoria {

    // Constructors ----------------------------------------------------------------------

    public Teoria() { super();}

    // Attributes ------------------------------------------------------------------------

    private Tipo tipo;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    // Relationships ----------------------------------------------------------------------

    private EjercicioDiofantica ejercicioDiofantica;
    private Pdf pdf;

    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    public EjercicioDiofantica getEjercicioDiofantica() {
        return ejercicioDiofantica;
    }

    public void setEjercicioDiofantica(EjercicioDiofantica ejercicioDiofantica) {
        this.ejercicioDiofantica = ejercicioDiofantica;
    }

    @Valid
    @NotNull
    @OneToMany(mappedBy = "teoria", cascade = CascadeType.ALL)
    public Pdf getPdf() {
        return pdf;
    }

    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }
}
