package creational.abstractFactoryNew1;

public class WoodTable implements Table{
    @Override
    public void getDescription() {
        System.out.println("wood table is created");
    }
}
