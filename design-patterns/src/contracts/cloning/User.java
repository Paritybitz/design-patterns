package cloning;

public class User extends Person implements Cloneable {
    public int id;
    public Address address;

    public User(Name name, int id, Address address){
        super(name);
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString(){
        return String.format("name: %s | id: %d | address: %s", name.toString(), id, address.toString()); //check how to format type address
    }

    @Override
    public Object clone() throws CloneNotSupportedException { //Object class clone(), not Cloneable
        User user = null;

        try {
            //perform shallow copy
            user = (User)super.clone();      

            //clone any internal objects
            user.address = (Address)user.address.clone();
            user.name = (Name)user.name.clone();

        } 
        catch (CloneNotSupportedException e) {
            System.out.println("cloneable didnt work");         
        }        

        return user;
    }   
}
