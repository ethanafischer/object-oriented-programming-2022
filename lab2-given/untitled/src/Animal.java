// -----Animal.java--------------------------------------------
public class Animal {
    private int numLegs;

    public Animal(int legs) {
        numLegs = legs;
    }

    public int getLegs(){ return numLegs; }

    public String toString() {
        return "I am an Animal object with " + numLegs + " legs";
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != Animal.class) return false;

        return this.numLegs == ((Animal) o).numLegs;
    }
}