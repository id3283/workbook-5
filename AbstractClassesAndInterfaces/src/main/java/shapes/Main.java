package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractShape myShape;

        myShape = new Rectangle(3,2);
        myShape.calculateArea();

        myShape = new Circle(3);
        myShape.calculateArea();
    }
}
