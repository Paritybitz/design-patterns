package Generics;

public class GenericClass <Thing> {
    Thing x;

    GenericClass(Thing x) {
        this.x = x;
    }

    public Thing getX() {
        return x;
    }
    
}
