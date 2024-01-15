package CommandPattern.SimpleRemoteWL;

import CommandPattern.SimpleRemote.GarageDoorOpenCommand;
import CommandPattern.SimpleRemote.LightOffCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemote remote = new SimpleRemote();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        remote.setCommand(light::off);
        remote.buttonWasPressed();

        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
    }
}
