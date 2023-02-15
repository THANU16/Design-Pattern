package structural.flyweight.ShootingGame;

public class main {
    public static void main(String[] args) {
        String[] playerType = {"Terrorist", "Police","Terrorist", "NormalHuman", "Police" };
        for (String  i : playerType){
            Player player = PlayerFactory.getPlayer(i);
            player.assignWeapon("AK-47");
            player.mission();
        }
    }
}
