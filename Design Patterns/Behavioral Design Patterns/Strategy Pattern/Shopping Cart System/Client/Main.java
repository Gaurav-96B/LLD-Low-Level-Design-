public class Main{
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(new Item("Laptop", 1200.00));
        cart.addItem(new Item("Headphones", 200.00));

        // Pay using Credit Card
        System.out.println("Using Credit Card for payment:");
        cart.checkout(new CreditCardPayment("1234-5678-9012-3456"));

        // Pay using PayPal
        System.out.println("\nUsing PayPal for payment:");
        cart.checkout(new PayPalPayment("user@example.com"));

        // Pay using UPI
        System.out.println("\nUsing UPI for payment:");
        cart.checkout(new UPIPayment("user@upi"));
    }
}
