package StrategyPattern.TextEditor;

public class PlainTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text;
    }
}
