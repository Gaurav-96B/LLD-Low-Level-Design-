import java.util.List;

// Concrete aggregate
public class ListAggregate<T> implements Aggregate<T> {
    private List<T> elements;

    public ListAggregate(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(elements);
    }
}
