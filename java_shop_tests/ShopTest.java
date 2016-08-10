import static org.junit.Assert.*;
import org.junit.*;
import java_shop.*;

public class ShopTest {

  Shop shop;

  @Before
  public void before() {
    shop = new Shop("Java Break Java KitKat", 1000);
  }

  @Test
  public void canGetName() {
    assertEquals("Java Break Java KitKat", shop.getName());
  }

  @Test
  public void canGetMoney() {
    assertEquals(1000, shop.getMoney());
  }

}
