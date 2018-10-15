package domain;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class User extends Actor {

    // Constructors ----------------------------------------------------------------------

    public User() { super();}

    // Attributes ------------------------------------------------------------------------



    // Relationships ----------------------------------------------------------------------

    private Collection<Ejercicio> ejercicios;

    @NotNull
    @OneToMany
    public Collection<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(Collection<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
}
