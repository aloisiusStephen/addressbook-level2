package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;



public class Tagging {

    private TaggingAction action ;
    private String personName;
    private String tagDescription;

    public Tagging(Person person, Tag tag, TaggingAction action ){
        this.personName = person.getName().toString();
        this.tagDescription = tag.toString();
        this.action = action;
    }

    public String toString(){
        String actionIndicator = new String();

        if (this.action == TaggingAction.ADDING){
            actionIndicator = "+";
        }else if(this.action == TaggingAction.DELETING){
            actionIndicator = "-";            
        }

        return actionIndicator + " " + personName + " " + tagDescription;
    }


}
