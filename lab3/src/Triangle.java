import java.awt.Point;
import java.awt.Color;
import java.util.LinkedList;
public class Triangle implements Shape {
    private Point a;
    private Point b;
    private Point c;
    private Color color;
    public Triangle(Point a, Point b, Point c, Color color){
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Point getVertexA() { return a; }

    public Point getVertexB() { return b; }

    public Point getVertexC() { return c; }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (o.getClass() != this.getClass()) { return false; }

        Triangle t = (Triangle) o;

        return t.a.equals(a) && t.b.equals(b) && t.c.equals(c) && t.color.equals(color);
    }

    public Color getColor() { return color; }

    public void setColor(Color c) { color = c; }

    public double getArea() {
        return 0.5 * Math.abs(((a.getX() * (b.getY()-c.getY())) + (b.getX() * (c.getY()-a.getY())) + (c.getX() * (a.getY()-b.getY()))));
    }

    public double getPerimeter() {
        double distAB = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
        double distBC = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX()) + (c.getY()-b.getY())*(c.getY()-b.getY()));
        double distAC = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX()) + (a.getY()-c.getY())*(a.getY()-c.getY()));
        return distAB + distBC + distAC;
    }

    public void translate(Point p) {
        Point tA = new Point((int) (a.getX() + p.getX()), (int) (a.getY() + p.getY()));
        Point tB = new Point((int) (b.getX() + p.getX()), (int) (b.getY() + p.getY()));
        Point tC = new Point((int) (c.getX() + p.getX()), (int) (c.getY() + p.getY()));

        a = tA;
        b = tB;
        c = tC;
    }
}
