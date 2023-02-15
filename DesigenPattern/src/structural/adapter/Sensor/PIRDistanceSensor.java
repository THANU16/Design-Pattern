package structural.adapter.Sensor;

// this is a adapter
// convert the time to distance
public class PIRDistanceSensor implements DistanceSensor{
    private PIRGP1012 sensor;

    public PIRDistanceSensor(){
        this.sensor = new PIRGP1012();
    }
    @Override
    public double getDistance() {
        return sensor.getTime()* 0.056684;
    }
}
