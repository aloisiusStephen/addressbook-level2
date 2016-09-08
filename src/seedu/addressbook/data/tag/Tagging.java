package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;



public class Tagging {

    private TaggingAction action ;
    private Person person;
    private Tag tag;

    public Tagging(Person person, Tag tag, TaggingAction action ){
        this.person = person;
        this.tag = tag;
        this.action = action;
    }

    public String toString(){
        String actionIndicator = new String();

        if (this.action == TaggingAction.ADDING){
            actionIndicator = "+";
        }else if(this.action == TaggingAction.DELETING){
            actionIndicator = "-";            
        }

        return actionIndicator + " " + person.getName().toString() + " " + tag.toString();
    }


}
