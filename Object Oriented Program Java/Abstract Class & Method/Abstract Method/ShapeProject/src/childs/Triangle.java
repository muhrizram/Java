package childs;
import parents.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
    }

    public Triangle(double base, double height, String color) {
        setColor(color);
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        double area = 0.5 * base * height;
        return area;
    }
}
