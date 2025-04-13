package DesignPatterns.Singleton;

import java.io.File;

public class LoggerSingleton {
    public static LoggerSingleton INSTANCE;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new LoggerSingleton();

        return INSTANCE;
    }

    public void signInUser(String name, FileSingleton fileSingleton) {
        try{
            File file = fileSingleton.getFile();
            
            



        } catch (Exception e) {
            System.out.println("User signin failed");
        }

    }

    public static void main(String[] args) {
        FileSingleton fileSingleton = FileSingleton.getInstance();
        fileSingleton.createFile("log.txt");
    }
}
