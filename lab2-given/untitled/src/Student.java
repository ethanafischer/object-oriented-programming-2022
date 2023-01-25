// --------------Student.java --------------------------------------
public class Student extends Person{
    private double gpa;
    private double studentLoans;

    public Student(double gpa, double studentLoans, String name, double account, int legs) {
        super(name, account, legs);
        this.gpa = gpa;
        this.studentLoans = studentLoans;
    }

    public String toString(){
        return super.toString() + " and a Student object with a " + gpa +
                " gpa and " + studentLoans + " dollars of student loans.";
    }

    public double getPaid(double amount){
        double loansPayment = amount * 0.25;
        if (loansPayment >= studentLoans) {
            studentLoans =- loansPayment;
        } else {
            loansPayment = studentLoans;
            studentLoans = 0;
        }
        return super.getPaid(amount - loansPayment);
    }
}