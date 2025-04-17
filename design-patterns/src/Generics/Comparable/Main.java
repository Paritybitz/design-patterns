package Generics.Comparable;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        Person older = MaxUtil.max(p1, p2);
        System.out.println("Older person: " + older);
    }
}
