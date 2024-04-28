package Creational.AbstractFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago style cheese pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiesPizza(pizzaIngredientFactory);
            pizza.setName("Chicago style veggie pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago style clam pizza");
        }

        return pizza;
    }
}
