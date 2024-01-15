package FacadePattern;

public class HomeTheaterFacade {

    Amplifier amp;
    CdPlayer cdPlayer;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    StreamingPlayer player;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amp, CdPlayer cdPlayer, PopcornPopper popper, Projector projector, Screen screen, StreamingPlayer player, TheaterLights lights, Tuner tuner) {
        this.amp = amp;
        this.cdPlayer = cdPlayer;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.player = player;
        this.lights = lights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    public void listenToRadio(Double frequency) {
        System.out.println("Tuning in the air...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setTuner(tuner);
        amp.setVolume(5);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
