package DecoratorPattern.Logger;

public abstract class LoggerDecorator implements Logger{
    protected Logger wrappedLogger;

    public LoggerDecorator(Logger logger) {
        this.wrappedLogger = logger;
    }
}
