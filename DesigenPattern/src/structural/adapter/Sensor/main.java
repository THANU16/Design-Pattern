package structural.adapter.Sensor;

public class main {
    public static void main(String[] args) {
        PIRDistanceSensor distanceSensor =new PIRDistanceSensor();
        double distance = distanceSensor.getDistance();
        System.out.println("Your object distance is equal to = "+distance );
    }
}
