public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle() {}
    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }
    @Override
    double getPerimeter() {
        return 2 * width + 2 * length;
    }
    @Override
    public String toString() {
        return "Rectangle( width = " + width + ", length = " + length + ")";
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
}