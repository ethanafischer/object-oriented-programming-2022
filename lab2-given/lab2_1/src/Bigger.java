public class Bigger {
    public static double whichIsBigger(Circle c, Rectangle r, Polygon p) {
        double big = Util.perimeter(c);
        if (Util.perimeter(p) > Util.perimeter(c)) {
            big = Util.perimeter(p);
        }
        if (Util.perimeter(r) > Util.perimeter(p)) {
            big = Util.perimeter(r);
        }
        return big;
    }
}
