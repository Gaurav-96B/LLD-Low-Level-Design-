public class Main {
    public static void main(String[] args) {
        // Create stocks
        Stock apple = new Stock("AAPL", 150.0);
        Stock google = new Stock("GOOGL", 2800.0);
       
        // Create investors
        Investor investor1 = new Investor("Gaurav");
        Investor investor2 = new Investor("Rohit");
        Investor investor3 = new Investor("Anita");
        
        // Register observers
        apple.addObserver(investor1);
        apple.addObserver(investor2);

        google.addObserver(investor2);
        google.addObserver(investor3);
        
        // Simulate price updates
        apple.setPrice(155.5);
        google.setPrice(2850.0);

        // Investor leaves
        apple.removeObserver(investor2);

        // Another price update
        apple.setPrice(160.0);

    }
}

