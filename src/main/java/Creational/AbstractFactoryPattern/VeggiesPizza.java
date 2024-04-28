package Creational.AbstractFactoryPattern;

public class VeggiesPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiesPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing pizza " + name);
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
