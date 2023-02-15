package creational.singleton;

public class Singleton {
    private static final Singleton Instance = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return Instance;
    }

    public void print(){
        System.out.println("We use singleton");
    }

}
