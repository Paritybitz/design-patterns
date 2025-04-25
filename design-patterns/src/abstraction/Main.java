package abstraction;

public class Main {
    public static void main(String[] args) throws Exception {
        Human human1 = new Human("Bill");
        Human human2 = new Human("Sal", 27);

        human1.eat();
        human1.move();
        human2.speak();
        human1.ToString();
        human2.ToString();
    }
}
