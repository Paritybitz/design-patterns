package module_01.abstraction;

public class Birds extends Vertibrate implements Speak {
    
    @Override
    public void eat() {
        System.out.println("Birds eat seeds, insects, and fruits.");
    }

    @Override
    public void move() {
        System.out.println("Birds fly using their wings.");
    }

    @Override
    public void speak() {
        System.out.println("Birds chirp and sing.");
    }

    public void layEggs() {
        System.out.println("Birds lay eggs to reproduce.");
    }
    
}
