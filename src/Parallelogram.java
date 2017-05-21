import java.util.HashMap;
import java.util.Map;

public class Parallelogram extends Shape {
    private double x;
    private double y;
    private double h;

    public Parallelogram(double x, double y, double h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    @Override
    void draw() {
        System.out.println("Drawing Parallelogram....");
    }

    @Override
    double area() {
        return x * h;
    }

    @Override
    double perimeter() {
        return 2 * (x + y);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                " area = " + area() +
                " perimeter = " + perimeter() +
                " x= " + x +
                ", y= " + y +
                ", h= " + h + " " +
                '}';
    }
}
