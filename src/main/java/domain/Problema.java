package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Problema extends DomainEntity {

    // Constructors ----------------------------------------------------------------------

    public Problema() { super();}

    // Attributes ------------------------------------------------------------------------
    private boolean tieneSolucion;
    private String tipo;

    public boolean isTieneSolucion() {
        return tieneSolucion;
    }

    public void setTieneSolucion(boolean tieneSolucion) {
        this.tieneSolucion = tieneSolucion;
    }

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Relationships ----------------------------------------------------------------------

    private Teoria teoria;
    private Solucion solucion;
    private User user;

    @Valid
    @NotNull
    @OneToOne(optional = false)
    public Teoria getTeoria() {
        return teoria;
    }

    public void setTeoria(Teoria teoria) {
        this.teoria = teoria;
    }

    @Valid
    @NotNull
    @OneToOne(optional = false)
    public Solucion getSolucion() {
        return solucion;
    }

    public void setSolucion(Solucion solucion) {
        this.solucion = solucion;
    }

    @Valid
    @NotNull
    @ManyToOne(optional = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
