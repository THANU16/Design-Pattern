package structural.decoretor.Pizza;

public class User {
    public static void main(String[] args) {

        //first create bass bread
        NormalBread pizza = new NormalBread();

        //we need chess pizza
        Chess pizza1 = new Chess(pizza);
        System.out.println(pizza1.cost());
        System.out.println(pizza1.getDescription());

        //we need chicken pizza
        Chicken pizza2 = new Chicken(pizza);
        System.out.println(pizza2.cost());
        System.out.println(pizza2.getDescription());

        //we need mixed pizza
        Mixed pizza3 = new Mixed(pizza);
        System.out.println(pizza3.cost());
        System.out.println(pizza3.getDescription());

        //we need chees topping and mixed topping pizza
        Mixed pizza4 = new Mixed(pizza1);
        System.out.println(pizza4.cost());
        System.out.println(pizza4.getDescription());


    }
}
