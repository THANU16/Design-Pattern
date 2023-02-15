package creational.protoType;

public class Circle implements ProtoType{
    private String containColour ;
    private String borderStyle;
    private String borderColour;
    private int borderWidth;
    private int radius;
    private String description;

    public Circle(String containColour, String borderStyle, String borderColour, int borderWidth, int radius, String description) {
        this.containColour = containColour;
        this.borderStyle = borderStyle;
        this.borderColour = borderColour;
        this.borderWidth = borderWidth;
        this.radius = radius;
        this.description = description;
    }

    @Override
    public Circle clone() {
        return new Circle(containColour,borderStyle,borderColour,borderWidth,radius,description);
    }

    public void setContainColour(String containColour) {
        this.containColour = containColour;
    }

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    public void setBorderColour(String borderColour) {
        this.borderColour = borderColour;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getDetails(){
        System.out.println("containColour : "+ containColour+" borderStyle: "+borderStyle+" borderColour: "+borderColour+" borderWidth: "+borderWidth+" radius: "+radius+" ");
    }
}
