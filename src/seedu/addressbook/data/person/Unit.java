package seedu.addressbook.data.person;

/**
 * Represents the Unit of a Person's address in the address book.
 *
 */

public class Unit {

    private final String value;
    private boolean isPrivate;

    public Unit(String unit, boolean isPrivate) {
        this.value = unit;
        this.isPrivate = isPrivate;
    }

    public String getUnit(){
        return value;
    }
}