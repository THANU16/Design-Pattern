package creational.Builder;

public class ModernHouseBuilder implements HouseBuilder{
    @Override
    public void setWalls() {
        System.out.println("modern walls are set");
    }

    @Override
    public void setDoor() {
        System.out.println("modern door are set");
    }

    @Override
    public void setRoof() {
        System.out.println("modern roof are set");
    }
}
