package cloning;

public class Name implements Cloneable {
    String firstName;
    String lastName;

    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);         
            throw e;
        }
    }    
}
