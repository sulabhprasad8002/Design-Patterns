package FactoryMethodPattern.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new CHPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Chandler ordered a " + pizza.getName() + "\n");

        pizza = chStore.orderPizza("cheese");
        System.out.println("Joe ordered a" + pizza.getName() + "\n");
    }
}
