
public class Test {
    public static void main(String[] args) {
        Product testPen = new Pen("Parker", 99, "black");
        Product testSmartphone = new Smartphone("Samsung", 199, 4.5);
        
        Client testClient = new Client("Bob");
        testClient.addToBasket(testPen);
        testClient.addToBasket(testSmartphone);
        
        testClient.submitOrder();
        
        
        
        
    }
}

