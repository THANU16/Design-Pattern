package structural.decoretor.Bevarage;

public class Mocha extends Decoretor{
    private Bevarage bevarage;
    public Mocha(Bevarage bevarage){
        this.bevarage= bevarage;
    }

    @Override
    public int cost() {
        return bevarage.cost() + 50;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + " Mocha";
    }
}
