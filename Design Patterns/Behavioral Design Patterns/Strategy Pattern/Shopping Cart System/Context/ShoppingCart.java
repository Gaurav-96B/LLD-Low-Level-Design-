class ShoppingCart{
    List<Item>items;
    
    public ShoppingCart(){
        items=new ArrayList<>();
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public double calculateTotal() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
    public void checkout(PaymentStrategy paymentStrategy) {
        double total = calculateTotal();
        System.out.println("Cart Total: $" + total);
        paymentStrategy.pay(total);
    } 
}
