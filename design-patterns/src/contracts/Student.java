package contracts;



import java.io.*; 
import java.util.*; 
  
class Student implements Cloneable { 
  
    // attributes of Student class 
    String name = null; 
    int id = 0; 
  
    // default constructor 
    Student() {} 
  
    // parameterized constructor 
    Student(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    }

    //clone method
    @Override
    public Student clone(){
        try {
            return 
        } catch (CloneNotSupportedException e) {
            return new AssertionError();
        }

    }

    
    public static void main(String[] args) 
    { 
        // create an instance of Student 
        Student s1 = new Student("Ashish", 121); 
  
        // Try to clone s1 and assign 
        // the new object to s2 
        Student s2 = s1.clone(); 
    } 
}