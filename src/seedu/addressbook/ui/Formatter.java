package seedu.addressbook.ui;

public class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    public Formatter(){
    }
    
    /**
     * Formats a string for display in UI
     * 
     * @param message which is to be displayed
     * @return formatted String
     */
    public String formatDisplay(String message){
        return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    public String formatIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }

    
}
