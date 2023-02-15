package creational.abstactFactoryNew;

public class ChessPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut the pizza");
    }

    @Override
    public void box() {
        System.out.println("box the pizza");
    }
}
