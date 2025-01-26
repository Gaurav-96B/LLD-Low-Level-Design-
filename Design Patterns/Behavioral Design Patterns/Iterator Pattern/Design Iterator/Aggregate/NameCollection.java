class NameCollection implements Collection<String> {
    private String[] names;

    public NameCollection(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names); // Use the separated NameIterator class
    }
}
