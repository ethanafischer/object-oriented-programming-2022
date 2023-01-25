import java.util.*;

public class Applicant {
    private final String name;
    private final List<CourseGrade> grades;
    private final boolean hasDegree;
    private final int jobExperience;

    public Applicant(String name, List<CourseGrade> grades) {
        this.name = name;
        this.grades = grades;
        this.hasDegree = true;
        this.jobExperience = 0;
    }

    public Applicant(boolean hasDegree, int jobExperience) {
        this.name = "";
        this.grades = null;
        this.hasDegree = hasDegree;
        this.jobExperience = jobExperience;
    }
    public String getName() {
        return name;
    }

    public List<CourseGrade> getGrades() {
        return grades;
    }

    public CourseGrade getGradeFor(String course) {

        assert grades != null;
        for (CourseGrade entry : grades) {
            if (entry.getCourseName().equals(course)) {
                return entry;
            }
        }
        return null;
    }

    public boolean isHasDegree() { return hasDegree; }

    public int getJobExperience() { return jobExperience; }
}
