class Stock{
    private String stockName;
    private double stockPrice;
    List<Observer>observers;
    public Stock(String stockName,double stockPrice){
        this.stockName=stockName;
        this.stockPrice=stockPrice;
        observers=new ArrayList<>();
    }
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        for(Observer observer:observers){
            observer.update(stockName,stockPrice);
        }
    }
    public void setPrice(double stockPrice){
        this.stockPrice=stockPrice;
        notifyObserver();
    }
}
