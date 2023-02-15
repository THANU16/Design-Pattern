package structural.flyweight.ShootingGame;

public class NormalHuman implements Player{
    private final  String task;
    private String weapon;

    public NormalHuman(){
        this.task = " terrorist are coming so please leave the place quickly";
    }
    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
        System.out.println("you has "+weapon);
    }

    @Override
    public void mission() {
        System.out.println("your task is a "+task);
    }
}
