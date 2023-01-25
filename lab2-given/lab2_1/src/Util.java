import java.util.List;


public class Util {
    private static final double PI = 3.14159265358979323846;

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static double perimeter(Circle c) {
        return (2 * PI * c.getRadius());
    }

    public static double perimeter(Rectangle r) {
        double l = r.getBottomRight().getX() - r.getTopLeft().getX();
        double w = r.getTopLeft().getY() - r.getBottomRight().getY();
        return (2 * (l + w));
    }

    public static double perimeter(Polygon p) {
        double distance = 0;
        double x1, x2, y1, y2;
        List<Point> points = p.getPoints();
        for (int i = 0; i < points.size(); i++) {
            if (i == points.size() - 1) {
                x1 = points.get(0).getX();
                y1 = points.get(0).getY();
                x2 = points.get(i).getX();
                y2 = points.get(i).getY();
            } else {
                x1 = points.get(i).getX();
                y1 = points.get(i).getY();
                x2 = points.get(i + 1).getX();
                y2 = points.get(i + 1).getY();
            }
            distance += distance(x1, y1, x2, y2);
        }
        return distance;
    }
}
