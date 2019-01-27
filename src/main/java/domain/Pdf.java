package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.URL;

import javax.persistence.ManyToOne;
import javax.validation.Valid;

public class Pdf {

    // Constructors ----------------------------------------------------------------------

    public Pdf() { super();}

    // Attributes ------------------------------------------------------------------------

    private Tipo url;

    @URL
    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public Tipo getUrl() {
        return url;
    }

    public void setUrl(Tipo url) {
        this.url = url;
    }

    // Relationships ----------------------------------------------------------------------

    private Teoria teoria;

    @Valid
    @ManyToOne(optional = false)
    public Teoria getTeoria() {
        return teoria;
    }

    public void setTeoria(Teoria teoria) {
        this.teoria = teoria;
    }
}
