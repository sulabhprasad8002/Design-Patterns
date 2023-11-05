package AbstractFactoryPattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Cheese createCheese() {
        return new Reggiano();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] {
                new Garlic(),
                new Mushroom(),
                new RedPepper()
        };
    }

    public Clam createClam() {
        return new FreshClam();
    }
}
