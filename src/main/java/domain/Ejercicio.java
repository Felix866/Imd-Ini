package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class Ejercicio {

// Constructors -----------------------------------------------------------

    public Ejercicio() {
        super();
    }

    // Attributes -------------------------------------------------------------

    private String	titulo;
    private String	descripcion;
    private String tipo;
    private Double solucion;

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @NotBlank
    @NotNull
    public Double getSolucion() {
        return solucion;
    }

    public void setSolucion(Double solucion) {
        this.solucion = solucion;
    }

    // Relationships ----------------------------------------------------------

    private Tema tema;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }


}
