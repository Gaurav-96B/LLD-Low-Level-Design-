class Broker implements Observer {
    private String brokerName;

    public Broker(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println("Broker " + brokerName + " notified. New stock price: $" + stockPrice);
    }
}
