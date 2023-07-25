package chapter20;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    public static final String errorLog = "error-log.txt";
    public static final String warningLog = "warning-log.txt";
    public static final String fineLog = "fine-log.txt";
    private static final MyLogger instance = new MyLogger();
    Logger logger = Logger.getLogger("MyLogger");
    private FileHandler errorLogFile = null;
    private FileHandler warningLogFile = null;
    private FileHandler fineLogFile = null;

    private MyLogger() {
        try {
            errorLogFile = new FileHandler(errorLog, true);
            warningLogFile = new FileHandler(warningLog, true);
            fineLogFile = new FileHandler(fineLog, true);
        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

        errorLogFile.setFormatter(new SimpleFormatter());
        warningLogFile.setFormatter(new SimpleFormatter());
        fineLogFile.setFormatter(new SimpleFormatter());

        logger.setLevel(Level.ALL);
        errorLogFile.setLevel(Level.SEVERE);
        warningLogFile.setLevel(Level.WARNING);
        fineLogFile.setLevel(Level.FINE);

        logger.addHandler(errorLogFile);
        logger.addHandler(warningLogFile);
        logger.addHandler(fineLogFile);
    }

    public static MyLogger getInstance() {
        return instance;
    }

    public void log(String message) {
        logger.finest(message);
        logger.finer(message);
        logger.fine(message);
        logger.config(message);
        logger.info(message);
        logger.warning(message);
        logger.severe(message);
    }

    public void fine(String message) {
        logger.fine(message);
    }

    public void warning(String message) {
        logger.warning(message);
    }
}
