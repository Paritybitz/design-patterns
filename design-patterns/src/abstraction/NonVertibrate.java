package abstraction;

public abstract class NonVertibrate extends Animal {
    public NonVertibrate(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    public void noBackbone() {
        System.out.println("This animal does not have a backbone.");
    }    
}