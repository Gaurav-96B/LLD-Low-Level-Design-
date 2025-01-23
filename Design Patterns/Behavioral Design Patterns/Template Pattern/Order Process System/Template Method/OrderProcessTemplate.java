abstract class OrderProcessTemplate{
    boolean isGiftWrap;
    protected abstract void selectProduct();
    protected abstract void makePayment();
    public void packProduct(){
        if(isGiftWrap){
        System.out.println("Gift wrapping product");
        }
        else{
             System.out.println("Simply packed product");
        }
    }
    protected abstract void deliverProduct();
    public final void processOrder(){
        selectProduct();
        makePayment();
        packProduct();
        deliverProduct();
        
        
    }
}
