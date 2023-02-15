package creational.Builder;

public class ClassicHouseBuilder implements HouseBuilder{
    @Override
    public void setWalls() {
        System.out.println("classic wall are set");
    }

    @Override
    public void setDoor() {
        System.out.println("classic door are set");

    }

    @Override
    public void setRoof() {
        System.out.println("classic Roof are set");
    }
}
