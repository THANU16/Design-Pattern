package creational.abstractFactoryNew1;

public class WoodChair implements Chair{
    @Override
    public void getDescription() {
        System.out.println("wood chair is created");
    }
}
