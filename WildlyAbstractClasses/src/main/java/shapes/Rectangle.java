package shapes;

public class Rectangle extends AbstractShape{

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return this.length * this.width;
    }
}
