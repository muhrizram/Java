package childs;
import parents.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius, String color) {
        setColor(color);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

}
