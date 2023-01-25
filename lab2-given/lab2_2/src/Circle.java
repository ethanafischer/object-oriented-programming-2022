public class Circle {
    private Point p;
    private double r;

    public Circle(final Point p, final double r) {
        this.p = p;
        this.r = r;
    }

    public Point getCenter() { return p; }

    public double getRadius() { return r; }

    public double perimeter() {
        return (2 * 3.14159265358979323846 * this.getRadius());
    }
}
