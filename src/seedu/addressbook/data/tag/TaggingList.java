package seedu.addressbook.data.tag;

import java.util.ArrayList;
import java.util.List;

import seedu.addressbook.data.tag.UniqueTagList.DuplicateTagException;

/**
 * A list of tagging. 
 *
 */
public class TaggingList {
    
    private final List<Tagging> internalList = new ArrayList<>();
    
    /**
     * Constructs an empty TaggingList.
     */
    public TaggingList() {}
    
    public void add(Tagging toAdd) {
        internalList.add(toAdd);
    }

    public List<String> getStringList() {
        List<String> stringList = new ArrayList<>();
        for( Tagging t : internalList ) {
            stringList.add(t.toString());
        }
        return stringList;
    }

}
