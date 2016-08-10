import static org.junit.Assert.*;
import org.junit.*;
import java_shop.*;

public class CustomerTest {

  Customer customer;

  @Before
  public void before() {
    customer = new Customer("Gerald", 100, 50);
  }

  @Test
  public void canGetName() {
    assertEquals("Gerald", customer.getName());
  }

  @Test
  public void canGetMoney() {
    assertEquals(100, customer.getMoney());
  }

}
