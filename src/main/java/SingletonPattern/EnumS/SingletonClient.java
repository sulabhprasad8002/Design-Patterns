package SingletonPattern.EnumS;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.SINGLETON;

        System.out.println(singleton.getDescription());
    }
}
