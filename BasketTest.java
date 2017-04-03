import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest
{
   // Dobra robota! - pierwszy test JUnitowy jak najbardziej w porządku.
   // Testy jednostkowe są również swego rodzaju dokumentacją.
   // Do tego jednak nazwa testu musi przekazywać więcej informacji.
   // Jedna z konwencji: [UnitOfWork__StateUnderTest__ExpectedBehavior]
   @Test
   public void addProduct_newEmptyBasket_shouldIncreaseProductCount() {
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
