// -------- Person.java ---------------------------------------
public class Person extends Animal {
    private String name;
    private double accountBalance;


    public Person(String name, double accountBalance, int legs) {
        super(legs);
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getPaid(double money) {
        return accountBalance += money;
    }

    public String toString() {
        return super.toString() + " and a Person object whose name is " + name;
    }

    public boolean equals(Object o) {
        return super.equals(o) &&
                this.name == ((Person)o).name &&
                this.accountBalance == ((Person) o).accountBalance;

    }
}

