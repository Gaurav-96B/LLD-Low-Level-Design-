public class Main{
    public static void main(String[] args) {
        
        StoreOrder storeOder=new StoreOrder();
        storeOder.processOrder();
        
        System.out.println("\n");
        
        OnlineOrder onlineOder=new OnlineOrder();
        onlineOder.isGiftWrap=true;
        onlineOder.processOrder();
    }
}
