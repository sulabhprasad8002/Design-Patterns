package AbstractFactoryPattern;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Ny style cheese pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("NY style veggie pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY style clam pizza");
        }

        return pizza;
    }
}
