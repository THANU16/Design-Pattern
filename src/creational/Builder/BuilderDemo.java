package creational.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new ClassicHouseBuilder();
        houseBuilder.setWalls();
        houseBuilder.setDoor();
        houseBuilder.setRoof();

        HouseBuilder houseBuilder1 = new ModernHouseBuilder();
        houseBuilder1.setWalls();
        houseBuilder1.setDoor();
        houseBuilder1.setRoof();

    }
}
