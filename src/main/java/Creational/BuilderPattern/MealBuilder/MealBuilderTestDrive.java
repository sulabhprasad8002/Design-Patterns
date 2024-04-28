package Creational.BuilderPattern.MealBuilder;

public class MealBuilderTestDrive {
    public static void main(String[] args) {
        Meal.Builder mealBuilder = new Meal.Builder();
        Meal meal1 = mealBuilder.withBurger("Hamburger")
                                .withFries("FrenchFries")
                                .withDrink("AamPanna")
                                .withDessert("Softy").build();

        System.out.println(meal1.toString());
    }
}
