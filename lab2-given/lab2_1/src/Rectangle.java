public class Rectangle {
    private Point pTopLeft;
    private Point pBottomRight;

    public Rectangle(final Point pTopLeft, final Point pBottomRight) {
        this.pTopLeft = pTopLeft;
        this.pBottomRight = pBottomRight;
    }

    public Point getTopLeft() { return pTopLeft; }

    public Point getBottomRight() { return pBottomRight; }
}
