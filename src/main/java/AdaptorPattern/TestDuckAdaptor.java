package AdaptorPattern;

public class TestDuckAdaptor {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey duckAdaptor = new DuckAdaptor(duck);

        duckAdaptor.gobble();
        for(int i=0; i<10; i++) {
            duckAdaptor.fly();
        }
    }
}
