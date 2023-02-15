package creational.protoType;

public class ProtoTypeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red","simple","Blue", 1,6," this is circle");
        c1.getDetails();
        Circle c2 = c1.clone(); //copy of the object
        c2.setRadius(65);
        c2.getDetails();
    }
}
