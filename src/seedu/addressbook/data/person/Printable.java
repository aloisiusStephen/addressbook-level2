package seedu.addressbook.data.person;

/**
 * An interface for a Name, Phone, Email, Address.
 * Implmentation returns string for display.
 */
public interface Printable {


    /**
     * Returns a printable string of each object.
     */
   public String getPrintableString();
  
}
