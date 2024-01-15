package CommandPattern.SimpleRemoteWL;

public class GarageDoor {
    public GarageDoor() {

    }

    public void up() {
        System.out.println("Garage Door is open");
    }

    public void down() {
        System.out.println("Garage Door is closed");
    }

    public void stopped() {
        System.out.println("Garage Door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage Door lights on");
    }

    public void lightOff() {
        System.out.println("Garage Door lights is down");
    }
}
