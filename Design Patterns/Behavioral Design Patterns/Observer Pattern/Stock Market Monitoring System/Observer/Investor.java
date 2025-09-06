class Investor implements Observer{
    private String investorName;
    public Investor(String investorName){
        this.investorName=investorName;
    }
    
    public void update(String stockName,double stockPrice){
        System.out.println("Notification to " + investorName + ": " + stockName + " price changed to " + stockPrice);
    }
    
}
