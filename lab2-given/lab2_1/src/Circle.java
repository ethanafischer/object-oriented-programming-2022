public class Circle {
    private Point p;
    private double r;

    public Circle(final Point p, final double r) {
        this.p = p;
        this.r = r;
    }

    public Point getCenter() { return p; }

    public double getRadius() { return r; }
}
