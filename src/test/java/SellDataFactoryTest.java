import org.junit.Test;
import service.SellDataFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SellDataFactoryTest {

   @Test
   public void shouldBeACustomer() {
       assertTrue(SellDataFactory.checkIfACustomer(002));
   }

    @Test
    public void shouldNotBeACustomer() {
       assertFalse(SellDataFactory.checkIfACustomer(001));
    }

    @Test
    public void souldNotBeACustomerWhenDoesNotStartWith002() {
        assertFalse(SellDataFactory.checkIfACustomer(001));
        assertFalse(SellDataFactory.checkIfACustomer(003));
    }
}
