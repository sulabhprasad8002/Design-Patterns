package Structural.DecoratorPattern.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log("logged message");

        JsonLogger jsonLogger = new JsonLogger(consoleLogger);
        jsonLogger.log("logged message");

        TimeStampLogger timeStampLogger = new TimeStampLogger(jsonLogger);
        timeStampLogger.log("logged message");
    }
}
