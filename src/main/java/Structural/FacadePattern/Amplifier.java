package Structural.FacadePattern;

public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + "on");
    }

    public void off() {
        System.out.println(description + "off");
    }

    public void setSurroundSound() {
        System.out.println(description + "Surround sound on (5 speakers and 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println(description + "Setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + "Setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + "Setting Streaming Player to " + player);
        this.player = player;
    }

    public String toString() {
        return description;
    }
}
