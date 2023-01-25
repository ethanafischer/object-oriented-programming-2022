import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.stream().filter(d->d.getNumberOfTricks() < 8).map(d->d.getAge() + 1).collect(Collectors.toList());
    }
}