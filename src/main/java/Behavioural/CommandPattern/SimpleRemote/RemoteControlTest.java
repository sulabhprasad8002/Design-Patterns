package Behavioural.CommandPattern.SimpleRemote;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemote remote = new SimpleRemote();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
