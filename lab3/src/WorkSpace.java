import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class WorkSpace {
    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void add(Shape shape) { shapeList.add(shape); }

    public Shape get(int index) { return shapeList.get(index); }

    public int size() { return shapeList.size(); }

    public List<Circle> getCircles() {
        List<Circle> listCircles = new ArrayList<>();
        for (Shape c: shapeList){
            if (c.getClass() == Circle.class) {
                listCircles.add((Circle) c);
            }
        }
        return listCircles;
    }

    public List<Rectangle> getRectangles() {
        List<Rectangle> listRectangles = new ArrayList<>();
        for (Shape r: shapeList){
            if (r.getClass() == Rectangle.class) {
                listRectangles.add((Rectangle) r);
            }
        }
        return listRectangles;
    }

    public List<Triangle> getTriangles() {
        List<Triangle> listTriangles = new ArrayList<>();
        for (Shape t: shapeList){
            if (t.getClass() == Triangle.class) {
                listTriangles.add((Triangle) t);
            }
        }
        return listTriangles;
    }

    public List<Shape> getShapesByColor(Color color) {
        List<Shape> listShapesByColor = new ArrayList<>();
        for (Shape s: shapeList){
            if (s.getColor() == color) {
                listShapesByColor.add(s);
            }
        }
        return listShapesByColor;
    }

    public double getAreaOfAllShapes() {
        double totalArea = 0.0;
        for (Shape s: shapeList){
            totalArea += s.getArea();
        }
        return totalArea;
    }

    public double getPerimeterOfAllShapes() {
        double totalPerimeter = 0.0;
        for (Shape s: shapeList){
            totalPerimeter += s.getPerimeter();
        }
        return totalPerimeter;
    }
}
