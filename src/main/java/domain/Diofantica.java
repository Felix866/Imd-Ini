package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Access(AccessType.PROPERTY)
public class Diofantica extends Problema{

// Constructors -----------------------------------------------------------

    public Diofantica() {
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

    @NotNull
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    @NotNull
    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @NotNull
    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @NotNull
    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    @NotNull
    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    @NotNull
    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getX0() {
        return x0;
    }

    public void setX0(Integer x0) {
        this.x0 = x0;
    }

    public Integer getY0() {
        return y0;
    }

    public void setY0(Integer y0) {
        this.y0 = y0;
    }

    // Relationships ----------------------------------------------------------
}
