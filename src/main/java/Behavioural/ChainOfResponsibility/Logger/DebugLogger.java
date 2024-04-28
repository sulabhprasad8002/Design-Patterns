package Behavioural.ChainOfResponsibility.Logger;

public class DebugLogger extends Handler{
    @Override
    public void handleRequest(LoggingLevel loggingLevel) {
        if(loggingLevel == LoggingLevel.DEBUG) {
            System.out.println("Debug Log: This is a debug log");
        } else if (this.successor != null) {
            successor.handleRequest(loggingLevel);
        }
    }
}
