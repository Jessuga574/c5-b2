public class Circle extends Shape {
    private double radius;
    Circle() {
    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea() { return Math.PI * radius * radius; }
    double getPerimeter() { return 2 * Math.PI * radius; }
    public String toString() {
        return "Circle(radius = " + radius + ")";
    }
}
