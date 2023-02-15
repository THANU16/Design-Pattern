package creational.abstractFactoryNew1;

public class AbstractFactroyNew1Demo {
    public static void main(String[] args) {
        Factory f1 = new ModernFactory();
        Chair c1 = f1.createChair();
        c1.getDescription();
        Table t1 = f1.createTable();
        t1.getDescription();

        Factory f2 = new WoodFactory();
        Chair c2 = f1.createChair();
        c2.getDescription();
        Table t2 = f1.createTable();
        t2.getDescription();
    }
}
