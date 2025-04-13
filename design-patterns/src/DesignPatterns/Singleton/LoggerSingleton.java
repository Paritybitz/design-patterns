package DesignPatterns.Singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class LoggerSingleton {
    public static LoggerSingleton INSTANCE;
    private File file;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new LoggerSingleton();

        return INSTANCE;
    }

    public File createFile(String fileName) {
        if (file == null) {
            try {
                File file = new File(fileName);
                if (file.createNewFile())
                    System.out.println("File created: " + file.getName());
                else
                    System.out.println("File already exists");

            } catch (Exception e) {
                System.out.println("Unable to create file");
            }
        }
        return file;
    }

    public void signInUser(String name) {
        if (file == null) {
            System.out.println("Create file first");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(name);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.createFile("log.txt");
        logger.signInUser("Barak Obama");
        logger.signInUser("Donald Trump");
    }
}
