
public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle.....");
    }

    @Override
    double area() {
        return x * y;
    }

    @Override
    double perimeter() {
        return 2 * (x + y);
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "area = " + area() +
                " perimeter = " + perimeter() +
                " x=" + x +
                ", y=" + y + " " +
                '}';
    }
}
