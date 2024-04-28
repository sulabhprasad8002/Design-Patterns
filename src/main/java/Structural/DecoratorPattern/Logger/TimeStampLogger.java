package Structural.DecoratorPattern.Logger;

public class TimeStampLogger extends LoggerDecorator{
    public TimeStampLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String timestampedMessage = "[" + java.time.LocalDateTime.now() + "] " + message;
        wrappedLogger.log(timestampedMessage);
    }
}
