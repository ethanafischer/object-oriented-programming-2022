public class Rectangle {
    private Point pTopLeft;
    private Point pBottomRight;

    public Rectangle(final Point pTopLeft, final Point pBottomRight) {
        this.pTopLeft = pTopLeft;
        this.pBottomRight = pBottomRight;
    }

    public Point getTopLeft() { return pTopLeft; }

    public Point getBottomRight() { return pBottomRight; }

    public double perimeter() {
        double l = this.getBottomRight().getX() - this.getTopLeft().getX();
        double w = this.getTopLeft().getY() - this.getBottomRight().getY();
        return (2 * (l + w));
    }
}
