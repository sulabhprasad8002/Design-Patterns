package Creational.SingletonPattern.DoubleCheckedLocking;

public class SingletonClient {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.hashCode());
        });

        Thread t2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.hashCode());
        });

        t1.start();
        t2.start();
    }
}
