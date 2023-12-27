public class Main {
    public static void main(String[] args) {
        OrderProcessingFacade facade = new OrderProcessingFacade();
        int orderId = 123;

        facade.processOrder(orderId);
    }
}
