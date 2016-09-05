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

   
   /**
    * Returns a concatenated version of the printable strings of each object.
    *//*
  default String getPrintableString(Printable... printables){
      final StringBuilder builder = new StringBuilder();
      for(Printable p : printables) {
      builder.append(p.getPrintableString());
      }
      return builder.toString();
  }
*/
   
}
