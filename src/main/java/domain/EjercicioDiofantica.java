package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

public class EjercicioDiofantica {

// Constructors -----------------------------------------------------------

    public EjercicioDiofantica() {
        super();
    }

    // Attributes -------------------------------------------------------------

    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer u;
    private Integer v;
    private Integer x0;
    private Integer y0;
    private Boolean tieneSolucion;

    @NotBlank
    @NotNull
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    @NotBlank
    @NotNull
    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @NotBlank
    @NotNull
    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @NotBlank
    @NotNull
    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    @NotBlank
    @NotNull
    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    @NotBlank
    @NotNull
    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    @NotBlank
    @NotNull
    public Integer getX0() {
        return x0;
    }

    public void setX0(Integer x0) {
        this.x0 = x0;
    }

    @NotBlank
    @NotNull
    public Integer getY0() {
        return y0;
    }

    public void setY0(Integer y0) {
        this.y0 = y0;
    }

    public Boolean getTieneSolucion() {
        return tieneSolucion;
    }

    public void setTieneSolucion(Boolean tieneSolucion) {
        this.tieneSolucion = tieneSolucion;
    }

    // Relationships ----------------------------------------------------------

    private Teoria teoria;
    private User user;

    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL, optional = false)
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
