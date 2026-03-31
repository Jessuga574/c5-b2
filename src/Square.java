import java.awt.*;

public class Square extends Rectangle {
    private double side;
    Square(){}
    Square(double side) {
        this.side = side;
    }
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public double getArea() { return side *  side; }

    @Override
    double getPerimeter() { return 4 * side; }

    @Override
    public String toString() {
        return "Square(side = " + side + ")" ;
    }
}