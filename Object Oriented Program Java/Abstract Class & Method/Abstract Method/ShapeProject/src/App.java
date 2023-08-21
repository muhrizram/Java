import childs.Circle;
import childs.Triangle;
import parents.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape lingkaran = new Circle(20, "Biru");
        Shape segitiga = new Triangle(10, 10, "Merah");

        System.out.println("Luas Lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga  .getArea());
    }
}
