package domain;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Collection;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Problema extends DomainEntity {

    // Constructors ----------------------------------------------------------------------

    public Problema() { super();}

    // Attributes ------------------------------------------------------------------------
    private boolean tieneSolucion;
    private Collection<String> tipos;

    public boolean isTieneSolucion() {
        return tieneSolucion;
    }

    public void setTieneSolucion(boolean tieneSolucion) {
        this.tieneSolucion = tieneSolucion;
    }

    @NotEmpty
    @ElementCollection
    public Collection<String> getTipos() {
        return tipos;
    }

    public void setTipos(Collection<String> tipos) {
        this.tipos = tipos;
    }




    // Relationships ----------------------------------------------------------------------

    private Teoria teoria;
    private User user;

    @Valid
    @OneToOne(optional = false)
    public Teoria getTeoria() {
        return teoria;
    }

    public void setTeoria(Teoria teoria) {
        this.teoria = teoria;
    }

    @Valid
    @ManyToOne(optional = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
