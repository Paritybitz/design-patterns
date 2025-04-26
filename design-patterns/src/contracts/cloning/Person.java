package cloning;

public class Person implements Cloneable {
    public Name name;

    public Person(Name name) {
        this.name = name;
    }    

    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);         
            throw e;
        }
    }
}