package creational.abstractFactoryNew1;

public class WoodFactory extends Factory{
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
