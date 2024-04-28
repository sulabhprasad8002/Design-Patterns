package Structural.AdaptorPattern;

import java.util.Random;

public class DuckAdaptor implements Turkey{
    Duck duck;
    Random random;

    public DuckAdaptor(Duck duck) {
        this.duck = duck;
        random = new Random();
    }



    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if(random.nextInt(5) == 0) {
            this.duck.fly();
        }
    }
}
