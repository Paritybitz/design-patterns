package abstraction;

public class Birds extends Vertibrate implements Speak {
    
    public Birds(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

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
