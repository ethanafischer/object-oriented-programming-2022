final class Point
{
    public double x;
    public double y;
    public double z;

    public Point(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString()
    {
        return "(" + x + "," + y + "," + z + ")";
    }

    public boolean equals(Object other)
    {
        return other instanceof Point &&
                ((Point)other).x == this.x &&
                ((Point)other).y == this.y &&
                ((Point)other).z == this.z;
    }

//    public int hashCode()
//    {
//        int result = 17;
//        result = (int) (result * 31 + x);
//        result = (int) (result * 31 + y);
//        return result;
//    }

    public boolean adjacent(Point p)
    {
        return (x == p.x && Math.abs(y - p.y) == 1) ||
                (y == p.y && Math.abs(x - p.x) == 1);
    }
}
