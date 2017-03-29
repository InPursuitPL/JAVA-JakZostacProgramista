public class Client {
    private String name;
    private Basket basket;
    
    public Client(String name) {
        this.name = name;
        this.basket = new Basket();
    }
    
    public void addToBasket(Product item) {
        this.basket.addProduct(item);
    }
    
    public void removeFromBasket(Product item) {
        this.basket.remProduct(item);
    }
    
    public void submitOrder() {
        new Order().sendOrder(this.basket);
    }
}