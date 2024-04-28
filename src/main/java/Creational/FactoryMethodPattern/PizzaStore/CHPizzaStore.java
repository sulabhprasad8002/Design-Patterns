package Creational.FactoryMethodPattern.PizzaStore;

public class CHPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new CHStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new CHStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new CHStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new CHStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
