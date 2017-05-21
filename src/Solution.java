
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(10, 12);
        Shape parallelogram = new Parallelogram(1, 24, 15);

        Map<Integer, Shape> shapeMap = new HashMap<>();
        shapeMap.put(1, circle);
        shapeMap.put(2, rectangle);
        shapeMap.put(3, parallelogram);

        System.out.println("Max area = " + maxArea(shapeMap));
        System.out.println("Max perimeter = " + maxPerimeter(shapeMap));

        System.out.println("----Shapes----");
        System.out.println();
        System.out.println(circle.toString());
        System.out.println();
        System.out.println(rectangle.toString());
        System.out.println();
        System.out.println(parallelogram.toString());
    }

    private static double maxArea(Map<Integer, Shape> shapes) {
        double maxArea = shapes.get(1).area();

        for (Map.Entry<Integer, Shape> shape : shapes.entrySet()) {
            if (shape.getValue().area() > maxArea) {
                maxArea = shape.getValue().area();
            }
        }

        return maxArea;
    }

    private static double maxPerimeter(Map<Integer, Shape> shapes) {
        double maxPerimeter = shapes.get(1).perimeter();

        for (Map.Entry<Integer, Shape> shape : shapes.entrySet()) {
            if (shape.getValue().perimeter() > maxPerimeter) {
                maxPerimeter = shape.getValue().perimeter();
            }
        }

        return maxPerimeter;
    }


}
