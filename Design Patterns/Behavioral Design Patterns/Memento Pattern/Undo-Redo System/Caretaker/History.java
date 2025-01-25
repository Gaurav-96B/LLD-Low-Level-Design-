class History {
    private final List<TextMemento> mementoList = new ArrayList<>();
    private int currentIndex = -1;

    // Saves the current state for undo
    public void save(TextMemento memento) {
        // Remove all redo states if new changes are made
        while (mementoList.size() > currentIndex + 1) {
            mementoList.remove(mementoList.size() - 1);
        }
        mementoList.add(memento);
        currentIndex++;
    }

    // Undo the last action
    public TextMemento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return mementoList.get(currentIndex);
        }
        return null; // No more undo steps
    }

    // Redo the last undone action
    public TextMemento redo() {
        if (currentIndex < mementoList.size() - 1) {
            currentIndex++;
            return mementoList.get(currentIndex);
        }
        return null; // No more redo steps
    }
}
