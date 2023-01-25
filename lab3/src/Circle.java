import java.awt.Color;
import java.awt.Point;
import java.lang.Math;

public class Circle implements Shape{
    private double radius;
    private Point center;
    private Color color;
    public Circle(double radius, Point center, Color color){
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius;}

    public Point getCenter() { return center; }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (o.getClass() != this.getClass()) { return false; }

        Circle c = (Circle) o;

        return c.radius == radius && c.center.equals(center) && c.color.equals(color);
    }

    public Color getColor() { return color; }

    public void setColor(Color c) { color = c; }

    public double getArea() { return Math.PI*radius*radius; }

    public double getPerimeter() { return 2*Math.PI*radius; }

    public void translate(Point p) {
        Point tCenter = new Point((int) (center.getX() + p.getX()), (int) (center.getY() + p.getY()));
        center = tCenter;
    }
}
