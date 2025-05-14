package shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IShape> shapes = new ArrayList<>();

        Circle circle = new Circle(1);
        shapes.add(circle);

        Square square = new Square(2);
        shapes.add(square);

        double totalArea = 0;
        for (IShape shape: shapes) {
            totalArea += shape.calculateArea();
        }

        System.out.println("The total area for all shapes is: " + totalArea);
    }

}
