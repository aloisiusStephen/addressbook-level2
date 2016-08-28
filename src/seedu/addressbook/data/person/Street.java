package seedu.addressbook.data.person;

/**
 * Represents the Block of a Person's address the address book.
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
