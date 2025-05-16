package shapes;

public abstract class AbstractShape {

    void printArea() {
        System.out.println("Area of this shape is: " + this.calculateArea() );
    }

    abstract double calculateArea();
}
