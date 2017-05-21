
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius= " + radius + " " +
                "area = " + String.format("%.2f", area()) + " " +
                "perimeter = " + String.format("%.2f", perimeter()) + " " +
                '}';
    }
}
