class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println("Investor " + name + " notified. New stock price: $" + stockPrice);
    }
}
