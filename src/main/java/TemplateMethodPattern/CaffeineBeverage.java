package TemplateMethodPattern;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }

    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }
}
