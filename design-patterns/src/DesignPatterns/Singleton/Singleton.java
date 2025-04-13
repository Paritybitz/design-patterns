package DesignPatterns.Singleton;

public class Singleton {
    private static Singleton INSTANCE;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        
        return INSTANCE;
    }

    // getters and setters
}
