package Behavioural.StrategyPattern.DuckSimulator;

public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I cant flying!");
    }
}
