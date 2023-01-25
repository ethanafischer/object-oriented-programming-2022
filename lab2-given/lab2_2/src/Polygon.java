import java.util.List;

public class Polygon {
    private List<Point> points;

    public Polygon(final List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() { return points; }

    public double perimeter() {
        double distance = 0;
        double x1, x2, y1, y2;
        List<Point> points = this.getPoints();
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
            distance += Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        }
        return distance;
    }
}
