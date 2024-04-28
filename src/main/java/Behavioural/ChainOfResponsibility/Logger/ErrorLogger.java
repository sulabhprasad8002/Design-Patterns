package Behavioural.ChainOfResponsibility.Logger;

public class ErrorLogger extends Handler{
    @Override
    public void handleRequest(LoggingLevel loggingLevel) {
        if(loggingLevel == LoggingLevel.ERROR) {
            System.out.println("Error Log: This is an error log");
        } else if(successor != null) {
            successor.handleRequest(loggingLevel);
        }
    }
}
