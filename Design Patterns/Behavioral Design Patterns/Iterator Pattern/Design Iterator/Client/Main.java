public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        NameCollection nameCollection = new NameCollection(names);

        Iterator<String> iterator = nameCollection.createIterator();

        System.out.println("Iterating over the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
