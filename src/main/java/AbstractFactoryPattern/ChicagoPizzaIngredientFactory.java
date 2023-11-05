package AbstractFactoryPattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] {
                new BlackOlives(),
                new Eggplant(),
                new Spinach()
        };
    }

    public Clam createClam() {
        return new FrozenClam();
    }
}
