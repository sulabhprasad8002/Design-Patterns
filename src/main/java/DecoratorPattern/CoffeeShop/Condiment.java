package DecoratorPattern.CoffeeShop;

public abstract class Condiment extends Beverage{
    Beverage beverage;

    public abstract String getDescription();
}
