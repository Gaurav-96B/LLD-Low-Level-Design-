public class Main {
    public static void main(String[] args) {
        // Create the subject
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");
        Broker broker1 = new Broker("XYZ Securities");

        // Register observers
        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);
        stockMarket.registerObserver(broker1);

        // Update stock prices and notify observers
        System.out.println("Updating stock price to $100.0");
        stockMarket.setStockPrice(100.0f);

        System.out.println("\nUpdating stock price to $150.0");
        stockMarket.setStockPrice(150.0f);

        // Unregister an observer
        System.out.println("\nUnregistering Bob");
        stockMarket.unregisterObserver(investor2);

        // Update stock price again
        System.out.println("\nUpdating stock price to $200.0");
        stockMarket.setStockPrice(200.0f);
    }
}

