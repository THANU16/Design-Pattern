package structural.decoretor.Bevarage;

public class tea {
    public static void main(String[] args) {

        //we need espresso milk tea
        Espresso espresso = new Espresso();
        Milk tea1 = new Milk(espresso);
        System.out.println(tea1.getDescription());
        System.out.println(tea1.cost());

        //we need HouseBlend soy tea
        HouseBlend houseBlend = new HouseBlend();
        Mocha tea2 = new Mocha(houseBlend);
        System.out.println(tea2.getDescription());
        System.out.println(tea2.cost());


    }


}
