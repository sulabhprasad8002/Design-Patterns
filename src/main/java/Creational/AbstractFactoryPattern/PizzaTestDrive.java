package Creational.AbstractFactoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Jack ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Joey ordered a " + pizza2.getName() + "\n");

        Pizza pizza3 = nyPizzaStore.orderPizza("cheese");
        System.out.println("Rachel ordered a " + pizza3.getName() + "\n");

        Pizza pizza4 = nyPizzaStore.orderPizza("clam");
        System.out.println("Monica ordered a " + pizza4.getName() + "\n");
    }
}
