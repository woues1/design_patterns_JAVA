// Logger.java
package Singleton;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String fileName;
    private FileWriter writer;

    private Logger() {
        this.fileName = "log.txt";
        openFile();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private void openFile() {
        try {
            writer = new FileWriter(fileName, true);
        } catch (IOException e) {
            System.out.println("An error occurred while opening the file.");
            e.printStackTrace();
        }
    }

    public void SetFileName(String fileName) {
        close();
        this.fileName = fileName;
        openFile();
    }

    public void Write(String message) {
        try {
            writer.write(message + System.lineSeparator());
            writer.flush();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while closing the file.");
            e.printStackTrace();
        }
        instance = null;
    }
}