package structural.decoretor.Bevarage;

public class Soy extends Decoretor {
    private Bevarage bevarage;

    public Soy(Bevarage bevarage){
        this.bevarage = bevarage;
    }


    @Override
    public int cost() {
        return bevarage.cost() + 80 ;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + " Soy";
    }
}
