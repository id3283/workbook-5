package shapes;

public class Square implements IShape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return Math.pow(this.sideLength, 2);
    }
}
