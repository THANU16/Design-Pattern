package structural.decoretor.Pizza;

public class Chess extends Topping{

    Pizza pizza;
    public Chess(Pizza pizza){
        this.pizza =pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+200;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " has chess topping";
    }
}
