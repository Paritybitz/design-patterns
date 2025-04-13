package module_01.abstraction;

public abstract class Animal implements Speak {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }       

    public abstract void eat();
    public abstract void move();
    public abstract void speak();

    public String toString() {
        return "Animal | Name: " + name;
    }
}