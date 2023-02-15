package creational.multitone;

public class MultitoneDemo {
    public static void main(String[] args) {
        Manager m1 = Manager.getInstance("thanu",22,01);
        m1.getDetails();
        Manager m2 = Manager.getInstance("kamal",22,01);
        m2.getDetails();
        Manager m3 = Manager.getInstance("kamal",22,02);
        m3.getDetails();
    }
}
