// -----------Professor.java---------------------------
public class Professor extends Person {
    private double mortgage;
    private boolean tenure;

    public Professor(double mortgage, boolean tenure, String name, int account, int legs) {
        super(name, account, legs);
        this.mortgage = mortgage;
        this.tenure = tenure;
    }

    public String toString(){
        String t;
        if (tenure) t = "tenure";
        else t = "no tenure";
        return super.toString() + " and a Professor object with a " + mortgage + " amount, and " + t;
    }

    public double getPaid(double amount){
        double mortgagePayment = amount * 0.25;
        if (mortgagePayment >= mortgage) {
            mortgage =- mortgagePayment;
        } else {
            mortgagePayment = mortgage;
            mortgage = 0;
        }
        return super.getPaid(amount - mortgagePayment);
    }

    public boolean equals(Object o) {
        return super.equals(o) &&
                this.mortgage == ((Professor)o).mortgage &&
                this.tenure == ((Professor) o).tenure;

    }
}