package parents;
public abstract class Shape {
    private String color;

    public Shape(){
        super();
    }

    public Shape(String color){
        super();
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public abstract double getArea();
}
