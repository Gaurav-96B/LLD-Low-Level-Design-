public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        // Initial write
        editor.write("Hello");
        history.save(editor.save());
        editor.printContent();

        // Write more text
        editor.write(", World!");
        history.save(editor.save());
        editor.printContent();

        // Undo the last action
        editor.restore(history.undo());
        System.out.println("\nAfter Undo:");
        editor.printContent();

        // Redo the last undone action
        editor.restore(history.redo());
        System.out.println("\nAfter Redo:");
        editor.printContent();

        // Add new text
        editor.write(" Welcome to the Text Editor!");
        history.save(editor.save());
        System.out.println("\nAfter Writing More Text:");
        editor.printContent();

        // Undo twice
        editor.restore(history.undo());
        System.out.println("\nAfter First Undo:");
        editor.printContent();

        editor.restore(history.undo());
        System.out.println("\nAfter Second Undo:");
        editor.printContent();

        // Redo one action
        editor.restore(history.redo());
        System.out.println("\nAfter Redo:");
        editor.printContent();
    }
}
