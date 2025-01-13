public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        // Workflow simulation
        document.edit();
        document.review();
        document.edit();
        document.approve();
        document.edit();
        document.publish();
        document.edit();
    }
}
