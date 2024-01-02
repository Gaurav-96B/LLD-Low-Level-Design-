// Aggregate interface
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
