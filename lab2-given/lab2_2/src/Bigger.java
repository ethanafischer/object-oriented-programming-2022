public class Bigger {
    public static double whichIsBigger(Circle c, Rectangle r, Polygon p) {
        double big = c.perimeter();
        if (p.perimeter() > c.perimeter()) {
            big = p.perimeter();
        }
        if (r.perimeter() > p.perimeter()) {
            big = r.perimeter();
        }
        return big;
    }
}
