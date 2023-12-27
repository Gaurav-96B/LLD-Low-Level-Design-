class OrderProcessingFacade {
    private OrderVerification orderVerification;
    private PaymentProcessing paymentProcessing;
    private ProductShipping productShipping;

    public OrderProcessingFacade() {
        this.orderVerification = new OrderVerification();
        this.paymentProcessing = new PaymentProcessing();
        this.productShipping = new ProductShipping();
    }

    public void processOrder(int orderId) {
        if (orderVerification.verifyOrder(orderId)) {
            paymentProcessing.processPayment(orderId);
            productShipping.shipProduct(orderId);
            System.out.println("Order processing completed for order: " + orderId);
        } else {
            System.out.println("Order verification failed for order: " + orderId);
        }
    }
}
