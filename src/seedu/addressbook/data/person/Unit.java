package seedu.addressbook.data.person;

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