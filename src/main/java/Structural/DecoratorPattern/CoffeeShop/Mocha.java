package Structural.DecoratorPattern.CoffeeShop;

public class Mocha extends Condiment{
    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
