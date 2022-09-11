package Main;

import appenders.ConsoleAppender;
import com.sun.tools.javac.Main;

import java.util.logging.Logger;

public class Log4Example {
     private static final Logger logger2 = Logger.getLogger(Log4Example.class);

    public static void main(String[] args) {
        ConsoleAppender consoleAppender = new ConsoleAppender();
        consoleAppender.setT


          logger2.info("Log some information");

    }
}