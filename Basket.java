import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> productList;
    
    public Basket() {
        this.productList = new ArrayList<Product>();
    }
    
    public void addProduct(Product item) {
        this.productList.add(item);
    }
    
    public void removeProduct(Product item) {
        this.productList.remove(item);
    }
    
    public int viewNumberOfProducts() {
        return this.productList.size();
    }
}