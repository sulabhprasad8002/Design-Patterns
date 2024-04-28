package Behavioural.ChainOfResponsibility.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();
        ErrorLogger errorLogger = new ErrorLogger();

        infoLogger.setSuccessor(debugLogger);
        debugLogger.setSuccessor(errorLogger);

        infoLogger.handleRequest(LoggingLevel.DEBUG);
    }
}
