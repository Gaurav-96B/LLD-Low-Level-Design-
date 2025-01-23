class StoreOrder extends OrderProcessTemplate{
    protected void selectProduct(){
        System.out.println("Selecting product on store");
    }
    protected void makePayment(){
        System.out.println("Making cash/card payment at store");
    }
    protected void deliverProduct(){
        System.out.println("Product delivered to customer");
    }
}
