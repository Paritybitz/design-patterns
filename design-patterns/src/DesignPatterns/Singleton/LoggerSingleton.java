package DesignPatterns.Singleton;

public class LoggerSingleton {
    public static LoggerSingleton INSTANCE;

    private LoggerSingleton() {
    }

    public static synchronized LoggerSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoggerSingleton();
        }
        return INSTANCE;
    }

    public void signInUser(String name) {
        System.out.println("User " + name + " signed in.");
    }

    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.signInUser("Ali Mohsin");
        logger.signInUser("Taqi Mohsin");
        logger.signInUser("Zain Mohsin");
    }
}
