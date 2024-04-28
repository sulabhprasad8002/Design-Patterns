package Behavioural.ChainOfResponsibility.Logger;

public class InfoLogger extends Handler{

    @Override
    public void handleRequest(LoggingLevel loggingLevel) {
        if(loggingLevel == LoggingLevel.INFO) {
            System.out.println("Info level logging: This is an informational message");
        } else if (this.successor != null) {
            this.successor.handleRequest(loggingLevel);
        }
    }
}
