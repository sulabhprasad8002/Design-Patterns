package Structural.DecoratorPattern.CoffeeShop;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
