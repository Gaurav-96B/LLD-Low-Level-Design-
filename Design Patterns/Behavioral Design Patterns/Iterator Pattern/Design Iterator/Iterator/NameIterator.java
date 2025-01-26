class NameIterator implements Iterator<String> {
    private String[] names;
    private int index = 0;

    // Constructor to initialize with the collection
    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return names[index++];
        }
        throw new RuntimeException("No more elements");
    }
}
