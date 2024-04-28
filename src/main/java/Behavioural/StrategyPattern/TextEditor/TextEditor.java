package Behavioural.StrategyPattern.TextEditor;

public class TextEditor {
    TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text) {
        String formattedText = this.formatter.format(text);
        System.out.println("Formatted: " + formattedText);
    }
}
