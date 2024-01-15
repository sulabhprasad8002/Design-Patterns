package CommandPattern.SimpleRemote;

public class SimpleRemote {

    Command slot;
    public SimpleRemote() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
