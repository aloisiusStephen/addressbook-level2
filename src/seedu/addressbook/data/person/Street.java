package seedu.addressbook.data.person;

/**
 * Represents the Street of a Person's address in the address book.
 *
 */
public class Street {
    private final String value;
    private boolean isPrivate;

    public Street(String street, boolean isPrivate) {
        this.value = street;
        this.isPrivate = isPrivate;
    }

    public String getStreet(){
        return value;
    }
}
