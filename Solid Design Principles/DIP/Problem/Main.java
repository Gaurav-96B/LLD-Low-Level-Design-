public class Main {

    public static void main(String[] args) {
        DebitCard debitCard=new DebitCard();
        CreditCard creditCard=new CreditCard();
      
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
