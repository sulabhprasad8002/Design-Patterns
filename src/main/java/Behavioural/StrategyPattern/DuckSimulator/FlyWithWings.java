package Behavioural.StrategyPattern.DuckSimulator;

public class FlyWithWings implements FlyBehavior{
    public void fly() {
        System.out.println("I'm flying!");
    }
}
