package contracts.EqualsHashcode;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     // Reflexivity: if the object is compared with itself, return true
    //     if (this == obj) return true;

    //     // Null check: return false if obj is null
    //     if (obj == null) return false;

    //     // Symmetry: must be the same class (avoids asymmetric cross-type equals)
    //     if (getClass() != obj.getClass()) return false;

    //     // Safe cast after class check
    //     Person other = (Person) obj;

    //     // Consistency and Transitivity: compare stable, relevant fields
    //     return Objects.equals(name, other.name) && age == other.age;
    // }

    //Bloch Equals

    //EQUALS CHECK: Is it SYMMETRIC? Is it TRANSITIVE? Is it CONSOSTENT?

    //parameter type must be Object
    @Override
    public boolean equals(Object obj){
        //REFLEXITIVITY
        // == check arg is reference of this obj
        if(this == obj) return true;

        // SYMMETRY and NULL CHECK (instanceof returns false for null objects)
        // check arg is correct type
        if(!(obj instanceof Person)) return false;

        //cast obj to class (Person)
        Person p = (Person) obj;

        //TRANSITIVITY
        // compare 'significant' fields
        return (Objects.equals(name, p.name) && age == p.age);
    }


    ///// ALWAYS OVERRIDE HASHCODE WHEN YOU OVERRIDE EQUALS /////
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
