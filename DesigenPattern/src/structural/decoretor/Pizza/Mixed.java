package structural.decoretor.Pizza;

public class Mixed extends Topping{
    Pizza pizza;
    public Mixed(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+ 500;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" has mixed topping ";
    }
}
