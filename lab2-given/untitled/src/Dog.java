public class Dog
{
    private int age;
    private int numberOfTricks;

    public Dog(int age, int numberOfTricks) {
        this.age = age;
        this.numberOfTricks = numberOfTricks; }


    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfTricks() { return numberOfTricks; }
    public void setNumberOfTricks(int num) { numberOfTricks = num; }

}
