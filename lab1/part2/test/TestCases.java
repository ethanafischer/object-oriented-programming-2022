//import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
//import java.util.stream.Collectors;
//import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


public class TestCases
{
   /*
    * This test is just to get you started.
    */
   @Test
   public void testGetName()
   {

      // This will not compile until you implement the Applicant class
      List<CourseGrade> grades = Arrays.asList(
         new CourseGrade("Intro to CS", 100),
         new CourseGrade("Data Structures", 95),
         new CourseGrade("Algorithms", 91),
         new CourseGrade("Computer Organization", 91),
         new CourseGrade("Operating Systems", 75),
         new CourseGrade("Non-CS", 83)
      );
      Applicant testApplicant = new Applicant("Aakash", grades);
      assertEquals("Aakash", testApplicant.getName());

      assertEquals(grades, testApplicant.getGrades());

      CourseGrade gradeExpected = new CourseGrade("Intro to CS", 100);
      CourseGrade gradeExpected2 = new CourseGrade("Operating Systems", 75);

      assertEquals(gradeExpected.getCourseName(), testApplicant.getGradeFor("Intro to CS").getCourseName());
      assertEquals(gradeExpected.getScore(), testApplicant.getGradeFor("Intro to CS").getScore());

      assertEquals(gradeExpected2.getCourseName(), testApplicant.getGradeFor("Operating Systems").getCourseName());
      assertEquals(gradeExpected2.getScore(), testApplicant.getGradeFor("Operating Systems").getScore());

      Applicant testApplicant2 = new Applicant(true, 1);
      assertFalse(SimpleIf.analyzeApplicant2(testApplicant2));

      Applicant testApplicant3 = new Applicant(false, 8);
      assertFalse(SimpleIf.analyzeApplicant2(testApplicant3));

      Applicant testApplicant4 = new Applicant(true, 4);
      assertTrue(SimpleIf.analyzeApplicant2(testApplicant4));

   }
}
