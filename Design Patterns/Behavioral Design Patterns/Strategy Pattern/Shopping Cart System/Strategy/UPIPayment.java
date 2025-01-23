class UPIPayment implements PaymentStrategy{
    String upiId;
    
    public UPIPayment(String upiId){
        this.upiId=upiId;
    }
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI ID: " + upiId);
    }
}
