import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest
{
   @Test
   public void basicTest() {
       Basket basket = new Basket();
       
       assertEquals(0, basket.viewNumberOfProducts());
       
       Product pen = new Pen("Parker", 99, "black");
       Product smartphone = new Smartphone("Samsung", 199, 4.5);
       basket.addProduct(pen);
       
       assertEquals(1, basket.viewNumberOfProducts());
       
       basket.addProduct(smartphone);
       
       assertEquals(2, basket.viewNumberOfProducts());
       
       basket.removeProduct(pen);
       
       assertEquals(1, basket.viewNumberOfProducts());
       
    }
}
