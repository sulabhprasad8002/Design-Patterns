package Creational.AbstractFactoryPattern;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;
    Veggies[] veggies;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 mins on 350 degree celsius");
    }

    void cut() {
        System.out.println("Cut the pizza in diagonal slices");
    }

    void box() {
        System.out.println("Place the pizza in official pizza box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String result() {
        StringBuffer result = new StringBuffer();

        result.append("-----" + name + "-----\n");

        if(dough != null) {
            result.append(dough);
            result.append("\n");
        }

        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }

        if(veggies != null) {
            for(Veggies veggie : veggies) {
                result.append(veggie + ", ");
            }

            result.append("\n");
        }

        if(clam != null) {
            result.append(clam);
        }

        return result.toString();
    }
}
