import java.awt.Point;
import java.awt.Color;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private Point topLeft;
    private Color color;
    Rectangle(double width, double height, Point topLeft, Color color) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
        this.color = color;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    public Point getTopLeft() { return topLeft; }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (o.getClass() != this.getClass()) { return false; }

        Rectangle r = (Rectangle) o;

        return r.width == width && r.height == height && r.color.equals(color) && r.topLeft.equals(topLeft);
    }

    public Color getColor() { return color; }

    public void setColor(Color c) { color = c; }

    public double getArea() { return width * height; }

    public double getPerimeter() { return 2 * (width + height); }

    public void translate(Point p) {
        Point tTopLeft = new Point((int) (topLeft.getX() + p.getX()), (int) (topLeft.getY() + p.getY()));
        topLeft = tTopLeft;
    }
}
