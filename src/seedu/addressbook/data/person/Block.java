/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * Represents the Block of a Person's address in the address book.
 *
 */
public class Block {

    private final String value;
    private boolean isPrivate;

    public Block(String block, boolean isPrivate) {
        this.value = block;
        this.isPrivate = isPrivate;
    }

    public String getBlock(){
        return value;
    }
}