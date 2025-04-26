package cloning;

public class Address implements Cloneable {
    public String street;
    public String city;    
    public String state;
    public int zip;
    
    
    public Address(String street, String city, String state, int zip){        
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", street, city, state, zip);        
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return (Address)super.clone();
        } 
        catch (CloneNotSupportedException e) {
            System.out.println(e);         
            throw e;
        }        
    }
}
