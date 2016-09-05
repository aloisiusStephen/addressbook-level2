package seedu.addressbook.data.person;

public abstract class Contact {

    protected String value;
    protected boolean isPrivate;

    public Contact(String contact, boolean isPrivate){
        this.isPrivate = isPrivate;
        this.value = contact;
    }
    
    protected Contact(){ 
        this.value = null;
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    public abstract boolean equals(Object other);
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
}
