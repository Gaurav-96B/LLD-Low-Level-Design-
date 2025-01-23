class CreditCardPayment implements PaymentStrategy{
    String creditCardNumber;
    
    public CreditCardPayment(String creditCardNumber){
        this.creditCardNumber=creditCardNumber;
    }
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + creditCardNumber);
    }
}
