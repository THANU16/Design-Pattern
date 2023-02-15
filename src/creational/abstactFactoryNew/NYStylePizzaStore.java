package creational.abstactFactoryNew;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza =null;
        switch (type){
            case "Chess":
                pizza = new ChessPizza();
                break;
            case "Chicken":
                pizza = new ChickenPizza();
                break;
            case "Veggie":
                pizza = new VeggiePizza();
                break;
            case "Mixed":
                pizza = new MixedPizza();
                break;
        }
        return pizza;
    }
}
