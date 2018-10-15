package domain;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class Administrator extends Actor{

    // Constructors

    public Administrator() {
        super();
    }

    // Relationships ----------------------------------------------------------

    private Collection<Ejercicio> ejercicios;
    private Collection<Tema> temas;

    @OneToMany
    @NotNull
    public Collection<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(Collection<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    @OneToMany
    @NotNull
    public Collection<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Collection<Tema> temas) {
        this.temas = temas;
    }
}
