
import java.util.*;

public class ExampleMap {

  /**
   * Return a list of "high scoring" students --- High scoring students are
   * students who have all grades strictly greater than the given threshold.
   * 
   * @param scoresByApplicantName A map of applicant names to applicant scores
   * @param scoreThreshold        The score threshold
   * @return The list of high-scoring applicant names
   */
  public static List<String> highScoringStudents(Map<String, List<CourseGrade>> scoresByApplicantName, int scoreThreshold)
  {
    List<String> highScoringStudents = new LinkedList<>();
    for (Map.Entry<String, List<CourseGrade>> entry: scoresByApplicantName.entrySet()) {
      String name = entry.getKey();
      List<CourseGrade> grades = entry.getValue();
      ArrayList<Integer> studentGrades = new ArrayList<>();

      for (CourseGrade grade: grades) {
        studentGrades.add(grade.getScore());
      }

      boolean higherThanThreshold = true;
      for (int grade: studentGrades) {
        if (grade < scoreThreshold) {
          higherThanThreshold = false;
        }
      }

      if (higherThanThreshold) {
        highScoringStudents.add(name);
      }
    }

    return highScoringStudents;
  }
}
