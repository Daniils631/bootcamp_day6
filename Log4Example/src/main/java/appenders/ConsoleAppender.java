package appenders;


import org.xml.sax.ErrorHandler;

import java.util.logging.Filter;



public class ConsoleAppender implements Appender {

    public void addFilter(Filter newFilter) {

    }

    public Filter getFilter() {
        return null;
    }

    public void clearFilters() {

    }

    public void close() {

    }

    public void doAppend(LoggingEvent event) {
        System.out.println("MyAppender: " + event.getMessage());
    }

    public String getName() {
        return null;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {

    }

    public ErrorHandler getErrorHandler() {
        return null;
    }

    public void setLayout(Layout layout) {

    }

    public Layout getLayout() {
        return null;
    }

    public void setName(String name) {

    }

    public boolean requiresLayout() {
        return false;
    }
}
