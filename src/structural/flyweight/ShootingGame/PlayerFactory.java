package structural.flyweight.ShootingGame;

import java.util.HashMap;

//this is the flyweight class
// avoid again create the same type of object
public class PlayerFactory {
    private static HashMap<String,Player> players = new HashMap<String,Player>();

    public static Player getPlayer(String type){
        Player player = null;
        if (players.containsKey(type)){
            player = players.get(type);
        }
        else{
            switch (type){
                case "Terrorist":
                    player = new Terrorist();
                    System.out.println("Terrorist is created");
                    break;
                case "Police":
                    player = new Police();
                    System.out.println("Police is created");
                    break;
                case "NormalHuman":
                    player = new NormalHuman();
                    System.out.println("NormalHuman is created");
                    break;
            }
            players.put(type,player);
        }
        return player;
    }
}
