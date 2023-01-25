import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

import java.util.LinkedList;

import java.awt.Color;
import java.awt.Point;

import static org.junit.jupiter.api.Assertions.*;


public class TestCases
{
   public static final double DELTA = 0.00001;

   /* some sample tests but you must write more! see lab write up */

   @Test
   public void testCircleGetArea()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);

      assertEquals(101.2839543, c.getArea(), DELTA);
   }

   @Test
   public void testCircleGetPerimeter()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);

      assertEquals(35.6759261, c.getPerimeter(), DELTA);
   }

   @Test
   public void testCircleGetRadius()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);

      assertEquals(5.678, c.getRadius(), DELTA);
   }

   @Test
   public void testCircleSetRadius()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);
      c.setRadius(6.5);
      assertEquals(6.5, c.getRadius(), DELTA);
   }

   @Test
   public void testCircleGetCenter()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);

      assertEquals(new Point(2, 3), c.getCenter());
   }

   @Test
   public void testCircleEquals()
   {
      Circle c1 = new Circle(5.678, new Point(2, 3), Color.BLACK);

      Circle c2 = new Circle(5.678, new Point(2, 3), Color.BLACK);

      Circle c3 = new Circle(7.05, new Point(2, 3), Color.BLACK);

      assertTrue(c1.equals(c2));
      assertFalse(c1.equals(c3));
   }

   @Test
   public void testCircleGetColor()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);

      assertEquals(Color.BLACK, c.getColor());
   }

   @Test
   public void testCircleSetColor()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);
      c.setColor(Color.BLUE);
      assertEquals(Color.BLUE, c.getColor());
   }

   @Test
   public void testCircleTranslate()
   {
      Circle c = new Circle(5.678, new Point(2, 3), Color.BLACK);
      c.translate(new Point(1, 1));
      assertEquals(new Point(3, 4), c.getCenter());
   }

   @Test
   public void testRectangleGetWidth()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);

      assertEquals(5, r.getWidth());
   }

   @Test
   public void testRectangleSetWidth()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);
      r.setWidth(10);
      assertEquals(10, r.getWidth());
   }

   @Test
   public void testRectangleGetHeight()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);

      assertEquals(6, r.getHeight());
   }

   @Test
   public void testRectangleSetHeight()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);
      r.setHeight(12);
      assertEquals(12, r.getHeight());
   }

   @Test
   public void testRectangleGetTopLeft()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);

      assertEquals(new Point(2, 3), r.getTopLeft());
   }

   @Test
   public void testRectangleGetArea()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);

      assertEquals(30, r.getArea());
   }

   @Test
   public void testRectangleGetPerimeter()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);

      assertEquals(22, r.getPerimeter());
   }

   @Test
   public void testRectangleGetColor()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);

      assertEquals(Color.BLACK, r.getColor());
   }

   @Test
   public void testRectangleSetColor()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);
      r.setColor(Color.BLUE);
      assertEquals(Color.BLUE, r.getColor());
   }

   @Test
   public void testRectangleTranslate()
   {
      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);
      r.translate(new Point(1, 1));
      assertEquals(new Point(3, 4), r.getTopLeft());
   }

   @Test
   public void testRectangleEquals()
   {
      Rectangle r1 = new Rectangle(5.678, 6, new Point(2, 3), Color.BLACK);

      Rectangle r2 = new Rectangle(5.678, 6, new Point(2, 3), Color.BLACK);

      Rectangle r3 = new Rectangle(7.05, 6, new Point(2, 3), Color.BLACK);

      assertTrue(r1.equals(r2));
      assertFalse(r1.equals(r3));
   }

   @Test
   public void testTriangleGetVertexA()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      assertEquals(new Point(0, 0), t.getVertexA());
   }

   @Test
   public void testTriangleGetVertexB()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      assertEquals(new Point(2, 3), t.getVertexB());
   }

   @Test
   public void testTriangleGetVertexC()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      assertEquals(new Point(5, 0), t.getVertexC());
   }

   @Test
   public void testTriangleGetArea()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      assertEquals(7.5, t.getArea());
   }

   @Test
   public void testTriangleGetPerimeter()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      assertEquals(12.84819, t.getPerimeter(), DELTA);
   }

   @Test
   public void testTriangleGetColor()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      assertEquals(Color.BLACK, t.getColor());
   }

   @Test
   public void testTriangleSetColor()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);
      t.setColor(Color.BLUE);
      assertEquals(Color.BLUE, t.getColor());
   }

   @Test
   public void testTriangleTranslate()
   {
      Triangle t = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);
      t.translate(new Point(1, 1));
      assertEquals(new Point(1, 1), t.getVertexA());
      assertEquals(new Point(3, 4), t.getVertexB());
      assertEquals(new Point(6, 1), t.getVertexC());
   }

   @Test
   public void testTriangleEquals()
   {
      Triangle t1 = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      Triangle t2 = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      Triangle t3 = new Triangle(new Point(0, 0), new Point(2, 4), new Point(5, 0), Color.BLACK);

      assertTrue(t1.equals(t2));
      assertFalse(t1.equals(t3));
   }

   @Test
   public void testWorkSpaceAreaOfAllShapes()
   {
      WorkSpace ws = new WorkSpace();

      ws.add(new Rectangle(1.234, 5.678, new Point(2, 3), Color.BLACK));
      ws.add(new Circle(5.678, new Point(2, 3), Color.BLACK));
      ws.add(new Triangle(new Point(0,0), new Point(2,-4), new Point(3, 0), 
                 Color.BLACK));

      assertEquals(114.2906063, ws.getAreaOfAllShapes(), DELTA);
   }

   @Test
   public void testWorkSpaceGetCircles()
   {
      WorkSpace wsC = new WorkSpace();
      List<Circle> expectedC = new LinkedList<>();

      // Have to make sure the same objects go into the WorkSpace as
      // into the expected List since we haven't overriden equals in Circle.
      Circle c1 = new Circle(5.678, new Point(2, 3), Color.BLACK);
      Circle c2 = new Circle(1.11, new Point(-5, -3), Color.RED);

      wsC.add(new Rectangle(1.234, 5.678, new Point(2, 3), Color.BLACK));
      wsC.add(c1);
      wsC.add(new Triangle(new Point(0,0), new Point(2,-4), new Point(3, 0),
                 Color.BLACK));
      wsC.add(c2);

      expectedC.add(c1);
      expectedC.add(c2);

      // Doesn't matter if the "type" of lists are different (e.g Linked vs
      // Array).  List equals only looks at the objects in the List.
      assertEquals(expectedC, wsC.getCircles());
   }

   @Test
   public void testWorkSpaceGetRectangles()
   {
      WorkSpace wsR = new WorkSpace();
      List<Rectangle> expectedR = new LinkedList<>();

      // Have to make sure the same objects go into the WorkSpace as
      // into the expected List since we haven't overriden equals in Circle.
      Rectangle r1 = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);
      Rectangle r2 = new Rectangle(1, 1, new Point(-5, -3), Color.RED);

      wsR.add(new Circle(5.678, new Point(2, 3), Color.BLACK));
      wsR.add(r1);
      wsR.add(new Triangle(new Point(0,0), new Point(2,-4), new Point(3, 0),
              Color.BLACK));
      wsR.add(r2);

      expectedR.add(r1);
      expectedR.add(r2);

      // Doesn't matter if the "type" of lists are different (e.g Linked vs
      // Array).  List equals only looks at the objects in the List.
      assertEquals(expectedR, wsR.getRectangles());
   }

   @Test
   public void testWorkSpaceGetTriangles()
   {
      WorkSpace wsT = new WorkSpace();
      List<Triangle> expectedT = new LinkedList<>();

      // Have to make sure the same objects go into the WorkSpace as
      // into the expected List since we haven't overriden equals in Circle.
      Triangle t1 = new Triangle(new Point(0, 0), new Point(2, 3), new Point(5, 0), Color.BLACK);
      Triangle t2 = new Triangle(new Point(0,0), new Point(2,-4), new Point(3, 0), Color.RED);

      wsT.add(new Circle(5.678, new Point(2, 3), Color.BLACK));
      wsT.add(t1);
      wsT.add(new Rectangle(1.234, 5.678, new Point(2, 3), Color.BLACK));
      wsT.add(t2);

      expectedT.add(t1);
      expectedT.add(t2);

      // Doesn't matter if the "type" of lists are different (e.g Linked vs
      // Array).  List equals only looks at the objects in the List.
      assertEquals(expectedT, wsT.getTriangles());
   }

   @Test
   public void testWorkSpacePerimeterOfAllShapes()
   {
      WorkSpace ws = new WorkSpace();

      ws.add(new Rectangle(5, 6, new Point(2, 3), Color.BLACK));
      ws.add(new Circle(5, new Point(2, 3), Color.BLACK));
      ws.add(new Triangle(new Point(0,0), new Point(2, 3), new Point(5, 0), Color.BLACK));

      assertEquals(31.41593+12.84819+22, ws.getPerimeterOfAllShapes(), DELTA);
   }

   @Test
   public void testWorkSpaceGetShapesByColor()
   {
      WorkSpace ws = new WorkSpace();
      List<Shape> expected = new LinkedList<>();

      Rectangle r = new Rectangle(5, 6, new Point(2, 3), Color.BLACK);
      Circle c = new Circle(5, new Point(2, 3), Color.RED);
      Triangle t = new Triangle(new Point(0,0), new Point(2, 3), new Point(5, 0), Color.BLACK);

      expected.add(t);
      expected.add(r);

      ws.add(t);
      ws.add(c);
      ws.add(r);

      assertEquals(expected, ws.getShapesByColor(Color.BLACK));
   }

   /* HINT - comment out implementation tests for the classes that you have not 
    * yet implemented */
   @Test
   public void testCircleImplSpecifics()
      throws NoSuchMethodException
   {
      final List<String> expectedMethodNames = Arrays.asList(
         "getColor", "setColor", "getArea", "getPerimeter", "translate",
         "getRadius", "setRadius", "getCenter", "equals");

      final List<Class> expectedMethodReturns = Arrays.asList(
         Color.class, void.class, double.class, double.class, void.class,
         double.class, void.class, Point.class, boolean.class);

      final List<Class[]> expectedMethodParameters = Arrays.asList(
         new Class[0], new Class[] {Color.class}, new Class[0], new Class[0], new Class[] {Point.class},
         new Class[0], new Class[] {double.class}, new Class[0], new Class[] {Object.class});

      verifyImplSpecifics(Circle.class, expectedMethodNames,
         expectedMethodReturns, expectedMethodParameters);
   }

   @Test
   public void testRectangleImplSpecifics()
      throws NoSuchMethodException
   {
      final List<String> expectedMethodNames = Arrays.asList(
         "getColor", "setColor", "getArea", "getPerimeter", "translate",
         "getWidth", "setWidth", "getHeight", "setHeight", "getTopLeft", "equals");

      final List<Class> expectedMethodReturns = Arrays.asList(
         Color.class, void.class, double.class, double.class, void.class,
         double.class, void.class, double.class, void.class, Point.class, boolean.class);

      final List<Class[]> expectedMethodParameters = Arrays.asList(
         new Class[0], new Class[] {Color.class}, new Class[0], new Class[0], new Class[] {Point.class},
         new Class[0], new Class[] {double.class}, new Class[0], new Class[] {double.class}, 
         new Class[0], new Class[] {Object.class});

      verifyImplSpecifics(Rectangle.class, expectedMethodNames,
         expectedMethodReturns, expectedMethodParameters);
   }

   @Test
   public void testTriangleImplSpecifics()
      throws NoSuchMethodException
   {
      final List<String> expectedMethodNames = Arrays.asList(
         "getColor", "setColor", "getArea", "getPerimeter", "translate",
         "getVertexA", "getVertexB", "getVertexC", "equals");

      final List<Class> expectedMethodReturns = Arrays.asList(
         Color.class, void.class, double.class, double.class, void.class,
         Point.class, Point.class, Point.class, boolean.class);

      final List<Class[]> expectedMethodParameters = Arrays.asList(
         new Class[0], new Class[] {Color.class}, new Class[0], new Class[0], new Class[] {Point.class},
         new Class[0], new Class[0], new Class[0], new Class[] {Object.class});

      verifyImplSpecifics(Triangle.class, expectedMethodNames,
         expectedMethodReturns, expectedMethodParameters);
   }

   private static void verifyImplSpecifics(
      final Class<?> clazz,
      final List<String> expectedMethodNames,
      final List<Class> expectedMethodReturns,
      final List<Class[]> expectedMethodParameters)
      throws NoSuchMethodException
   {
      assertEquals(0, clazz.getFields().length,
              "Unexpected number of public fields");

      final List<Method> publicMethods = Arrays.stream(
         clazz.getDeclaredMethods())
            .filter(m -> Modifier.isPublic(m.getModifiers()))
            .collect(Collectors.toList());

      assertEquals(expectedMethodNames.size(), publicMethods.size(),
              "Unexpected number of public methods");

      assertTrue(expectedMethodNames.size() == expectedMethodReturns.size(), "Invalid test configuration");
      assertTrue(expectedMethodNames.size() == expectedMethodParameters.size(),
              "Invalid test configuration");

      for (int i = 0; i < expectedMethodNames.size(); i++)
      {
         Method method = clazz.getDeclaredMethod(expectedMethodNames.get(i),
            expectedMethodParameters.get(i));
         assertEquals(expectedMethodReturns.get(i), method.getReturnType());
      }
   }
}
