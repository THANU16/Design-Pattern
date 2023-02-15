package structural.decoretor.Bevarage;

public class Milk extends Decoretor{
    private Bevarage bevarage;
    public Milk(Bevarage bevarage){
        this.bevarage = bevarage;
    }

    @Override
    public int cost() {
        return bevarage.cost()+ 30;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + " Milk";
    }
}
