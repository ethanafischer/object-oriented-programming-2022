
public class SimpleIf {

  /**
   * Takes an applicant's average score and accepts the applicant if the average
   * is higher than 85.
   * 
   * @param avg The applicant's average score
   * @param threshold The threshold score
   * @return true if the applicant's average is over the threshold, and false otherwise
   */
  public static boolean analyzeApplicant(double avg, double threshold) {
    /*
     * TO DO: Write an if statement to determine if the avg is larger than the threshold and
     * return true if so, false otherwise
     */
    if (avg > threshold) {
      return true;
    }

    return false; // A bit pessimistic!
  }

  /**
   * Takes two applicants' average scores and returns the score of the applicant
   * with the higher average.
   * 
   * @param avg1 The first applicant's average score
   * @param avg2 The second applicant's average score
   * @return the higher average score
   */
  public static double maxAverage(double avg1, double avg2) {
    /*
     * TO DO: Write an if statement to determine which average is larger and return
     * that value.
     */
    if (avg1 > avg2) {
      return avg1;
    }

    return avg2; // Clearly not correct, but testable.
  }

  public static boolean analyzeApplicant2(Applicant applicant) {
    /**
     * This method filters out applicants who have completed a 4-year degree
     * at a university, and have had at least 2 years of prior job experience.
     */
    if (applicant.getJobExperience() >= 2) {
      return applicant.isHasDegree();
    }
    return false;
  }
}
