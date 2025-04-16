package DesignPatterns.Singleton;

import java.io.File;

public class FileSingleton {
    private static FileSingleton INSTANCE;
    private File file;

    private FileSingleton() {
    }

    public static synchronized FileSingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new FileSingleton();

        return INSTANCE;
    }

    public synchronized File createFile(String fileName) {
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

    public File getFile() {
        return file;
    }

    public static void main(String[] args) {
        FileSingleton fileSingleton = FileSingleton.getInstance();
        File file = fileSingleton.createFile("text.txt");
        File file2 = fileSingleton.createFile("text.txt");
    }
}
