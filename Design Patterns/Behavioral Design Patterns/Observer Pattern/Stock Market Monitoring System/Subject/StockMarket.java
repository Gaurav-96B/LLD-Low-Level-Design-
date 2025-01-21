class StockMarket implements Subject {
    private List<Observer> observers;
    private float stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    // Method to update the stock price
    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers(); // Notify observers whenever the stock price changes
    }
}
