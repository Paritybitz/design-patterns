package abstraction;

public abstract class Mammals extends Vertibrate {

    // Mammals vertebrate animals, so they inherit from Vertibrate
    public Mammals(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println("Mammals eat plants and meat.");
    }

    @Override
    public void move() {
        System.out.println("Mammals walk, run swim.");
    }

    public void giveBirth() {
        System.out.println("Mammals give birth.");
    }
}
