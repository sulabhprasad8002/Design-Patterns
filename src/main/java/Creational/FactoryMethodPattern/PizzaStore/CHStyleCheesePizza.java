package Creational.FactoryMethodPattern.PizzaStore;

public class CHStyleCheesePizza extends Pizza{
    public CHStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozaarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
