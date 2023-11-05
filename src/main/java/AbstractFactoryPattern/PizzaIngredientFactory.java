package AbstractFactoryPattern;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Clam createClam();
    public Veggies[] createVeggies();
}
