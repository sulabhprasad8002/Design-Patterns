package Creational.BuilderPattern.MealBuilder;

public class Meal {
    private String burger;
    private String fries;
    private String drink;
    private String dessert;

    private Meal() {}

    public String getBurger() {
        return burger;
    }

    public String getFries() {
        return fries;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setFries(String fries) {
        this.fries = fries;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Meal with: " + this.burger + " " + this.fries + " " + this.drink + " " + this.dessert;
    }
    static class Builder {
        private Meal meal;

        Builder() {
            this.meal = new Meal();
        }

        public Builder withBurger(String burger) {
            meal.setBurger(burger);
            return this;
        }

        public Builder withFries(String fries) {
            meal.setFries(fries);
            return this;
        }

        public Builder withDrink(String drink) {
            meal.setDrink(drink);
            return this;
        }

        public Builder withDessert(String dessert) {
            meal.setDessert(dessert);
            return this;
        }

        public Meal build() {
            return meal;
        }
    }
}
