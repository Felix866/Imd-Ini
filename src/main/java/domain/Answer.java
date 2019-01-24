package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

public class Answer {

    // Constructors ----------------------------------------------------------------------

    public Answer() { super();}

    // Attributes ------------------------------------------------------------------------

    private String title;
    private Boolean right;

    @NotBlank
    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getRight() {
        return right;
    }

    public void setRight(Boolean right) {
        this.right = right;
    }

    // Relationships ----------------------------------------------------------------------

}
