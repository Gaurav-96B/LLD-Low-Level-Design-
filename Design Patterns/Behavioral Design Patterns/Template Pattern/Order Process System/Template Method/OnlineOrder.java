class OnlineOrder extends OrderProcessTemplate{
    protected void selectProduct(){
        System.out.println("Selecting product and adding to cart");
    }
    protected void makePayment(){
        System.out.println("Making Cash o delivery or online payment at website/app");
    }
    protected void deliverProduct(){
        System.out.println("Product dispatched");
    }
}
