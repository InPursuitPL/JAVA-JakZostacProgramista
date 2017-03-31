public class Client {
    private String name;
    private Basket basket;
    private Order order;
    
    public Client(String name, Basket basket, Order order) {
        this.name = name;
        this.basket = basket;
        this.order = order;
    }
    
    public void addToBasket(Product item) {
        this.basket.addProduct(item);
    }
    
    public void removeFromBasket(Product item) {
        this.basket.removeProduct(item);
    }
    
    public void submitOrder() {
        this.order.sendOrder(this.basket);
    }
}