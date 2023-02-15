package structural.decoretor.Pizza;

public class Chicken extends Topping{
    Pizza pizza;

    public Chicken(Pizza pizza){
        this.pizza = pizza;
    }


    @Override
    public int cost() {
        return pizza.cost()+400;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" has chicken topping ";
    }
}
