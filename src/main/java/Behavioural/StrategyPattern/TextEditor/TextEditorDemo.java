package Behavioural.StrategyPattern.TextEditor;

public class TextEditorDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new PlainTextFormatter());
        textEditor.publishText("Some simple text");

        textEditor.setFormatter(new MarkdownTextFormatter());
        textEditor.publishText("Marked Down Bold Text");

        textEditor.setFormatter(new HTMLTextFormatter());
        textEditor.publishText("HTML formatted Bold Text");
    }
}
