import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Create a concrete aggregate
        Aggregate<String> aggregate = new ListAggregate<>(names);

        // Create an iterator
        Iterator<String> iterator = aggregate.createIterator();

        // Use the iterator to access elements
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
