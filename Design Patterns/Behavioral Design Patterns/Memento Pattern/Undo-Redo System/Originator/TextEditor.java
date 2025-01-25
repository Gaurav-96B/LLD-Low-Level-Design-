class TextEditor {
    private String content = "";

    // Saves the current state into a memento
    public TextMemento save() {
        return new TextMemento(content);
    }

    // Restores the state from a memento
    public void restore(TextMemento memento) {
        this.content = memento.getContent();
    }

    // Updates the content of the text editor
    public void write(String text) {
        content += text;
    }

    // Displays the current content
    public void printContent() {
        System.out.println("Current Content: " + content);
    }
}
