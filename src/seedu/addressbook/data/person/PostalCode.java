package seedu.addressbook.data.person;
/**
 * Represents the Postal Code of a Person's address in the address book.
 *
 */
public class PostalCode {

    private final String value;
    private boolean isPrivate;

    public PostalCode(String postalCode, boolean isPrivate) {
        this.value = postalCode;
        this.isPrivate = isPrivate;
    }

    public String getPostalCode(){
        return value;
    }
}
