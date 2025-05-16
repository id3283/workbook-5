package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();

        Rectangle rectangle = new Rectangle(16, 9);

        rectangle.printArea();
    }
}
