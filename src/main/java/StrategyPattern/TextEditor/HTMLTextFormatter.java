package StrategyPattern.TextEditor;

public class HTMLTextFormatter implements TextFormatter{
    @Override
    public String format(String text) {
        return "<strong>" + text + "<strong>";
    }
}
