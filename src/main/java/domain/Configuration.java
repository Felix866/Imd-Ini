package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Configuration extends DomainEntity {

    // Constructors ---------------------------------------------

    public Configuration() {
        super();
    }


    // Attributes -----------------------------------------------

    private String				englishWelcome;
    private String				spanishWelcome;

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getEnglishWelcome() {
        return this.englishWelcome;
    }

    public void setEnglishWelcome(final String englishWelcome) {
        this.englishWelcome = englishWelcome;
    }

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getSpanishWelcome() {
        return this.spanishWelcome;
    }

    public void setSpanishWelcome(final String spanishWelcome) {
        this.spanishWelcome = spanishWelcome;
    }
}


