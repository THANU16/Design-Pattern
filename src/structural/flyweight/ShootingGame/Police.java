package structural.flyweight.ShootingGame;

public class Police implements Player{
    private final String task;
    public String weapon;

    public Police() {
        this.task = "Find the bomb and refuse the bomb then kill the terrorist";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("Police has a "+weapon);
    }

    @Override
    public void mission() {
        System.out.println("Your mission is a "+ task);
    }
}
