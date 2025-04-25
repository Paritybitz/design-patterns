package abstraction;

public class Human extends Mammals implements Speak {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overload
    public Human(String name){
        this.name = name;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s eats their fruits and veggies", name));
    }

    @Override
    public void move() {
        System.out.println(String.format("%s walks and runs", name));
    }

    @Override
    public void speak() {
        System.out.println(String.format("hi im %s ", name));
    }



    public void ToString() {
        System.out.println("Human | Name: " + name + ", Age: " + age);
    }
}
