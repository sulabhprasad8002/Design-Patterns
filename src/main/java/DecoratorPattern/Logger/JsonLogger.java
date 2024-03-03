package DecoratorPattern.Logger;

public class JsonLogger extends LoggerDecorator{
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        String jsonMessage = "{'message': " + message + "}";
        wrappedLogger.log(jsonMessage);
    }
}
