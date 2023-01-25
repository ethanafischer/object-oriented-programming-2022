import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCasesCalculator
{
   public static final double DELTA = 0.00001;
   private Bindings bindings = new VariableBindings();

   @Before
   public void init()
   {
      bindings.addBinding("x", 2.5);
      bindings.addBinding("y", 10);
   }

   @Test
   public void test01_AddExpressionEvaluate()
   {
      IdentifierExpression x = new IdentifierExpression("x");
      IdentifierExpression y = new IdentifierExpression("y");
      AddExpression add = new AddExpression(x, y);

      assertEquals(12.5, add.evaluate(bindings), DELTA);
   }

   @Test
   public void test02_AddExpressionToString()
   {
      IdentifierExpression x = new IdentifierExpression("x");
      IdentifierExpression y = new IdentifierExpression("y");
      AddExpression add = new AddExpression(x, y);

      assertEquals("(x + y)", add.toString());
   }

   @Test
   public void test01_SubExpressionEvaluate()
   {
      IdentifierExpression x = new IdentifierExpression("x");
      IdentifierExpression y = new IdentifierExpression("y");
      SubtractExpression sub = new SubtractExpression(x, y);

      assertEquals(-7.5, sub.evaluate(bindings), DELTA);
   }

   @Test
   public void test02_SubExpressionToString()
   {
      IdentifierExpression x = new IdentifierExpression("x");
      IdentifierExpression y = new IdentifierExpression("y");
      SubtractExpression sub = new SubtractExpression(x, y);

      assertEquals("(x - y)", sub.toString());
   }
}