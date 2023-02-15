package structural.facade.Shape;

public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public  ShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawSquare(){
        square.draw();
    }

     public void drawCircle(){
        circle.draw();
    }

     public void drawRectangle(){
        rectangle.draw();
    }


}
