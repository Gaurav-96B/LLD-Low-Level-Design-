interface PaymentStrategy {
    public void pay(int amount);
}
class PayPal implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("payemnt of"+amount+ "using paypal");
    }
}
class UPI implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("payemnt of"+amount+ "using UPI");
    }
}
class CreditCard implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("payemnt of"+amount+ "using CreditCard");
    }
}

class PaymentService{
    private PaymentStrategy paymentStrategy;
    
    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    
    public void makePayment(int amount){
        paymentStrategy.pay(amount);
    }
}
class Main {
    public static void main(String[] args){
     PaymentService paymentService=new PaymentService(new CreditCard());
     paymentService.makePayment(10);

    }
}
