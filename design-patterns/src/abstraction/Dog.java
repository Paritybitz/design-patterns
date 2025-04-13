package module_01.abstraction;

public class Dog extends Animal implements Speak {
    private String name;

    public Dog(String name) {
        super(); // Call the constructor of the superclass Animal
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    @Override
    public void move() {
        System.out.println(name + " is running around happily.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof Woof!");
    }
    
    public String getName() {
        return name;
    }

}
