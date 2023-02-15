package structural.flyweight.ShootingGame;

public class Terrorist implements Player {
    private final String task;
    private String weapon;

    public Terrorist(){
        this.task = "Put the bomb and kill the police";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("terrorist has "+ weapon);
    }

    @Override
    public void mission() {
        System.out.println("Your mission is "+task);
    }
}
