package Singleton;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.SetFileName("new_log.txt"); // Change file name
        logger.Write("Simulation started");
        logger.Write("Processing data...");
        logger.Write("Simulation finished");
        logger.close(); // Remember to close the logger
    }
}