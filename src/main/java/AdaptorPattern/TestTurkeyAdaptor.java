package AdaptorPattern;

public class TestTurkeyAdaptor {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }
}
