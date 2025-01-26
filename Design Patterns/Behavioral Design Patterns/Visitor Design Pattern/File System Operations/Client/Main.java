public class Main {
    public static void main(String[] args) {
        // Object structure
        List<File> files = new ArrayList<>();
        files.add(new TextFile("document.txt"));
        files.add(new ImageFile("photo.jpg"));

        // Visitors
        Visitor virusScanner = new VirusScanner();
        Visitor compressor = new Compressor();

        // Process files with virus scanner
        System.out.println("Running virus scan...");
        for (File file : files) {
            file.accept(virusScanner);
        }

        // Process files with compressor
        System.out.println("\nRunning compression...");
        for (File file : files) {
            file.accept(compressor);
        }
    }
}
