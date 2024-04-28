package Creational.SingletonPattern.Classic;

public class Singleton {
    private Singleton() {};

    private static  Singleton singleton;

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public String getDescription() {
        return "Hi! This is a Classic Singleton";
    }
}
