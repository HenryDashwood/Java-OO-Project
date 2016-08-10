import static org.junit.Assert.*;
import org.junit.*;
import java_shop.*;

public class ItemTest {

  Item item;
  Customer customer;
  Shop shop;

  @Before
  public void before() {
    item = new Item("Java Developer Kit", 10, 200);
    customer = new Customer("Gerald", 100, 50);
    shop = new Shop("Java Break Java KitKat", 1000);
  }

  @Test
  public void canGetName() {
    assertEquals("Java Developer Kit", item.getName());
  }

  @Test
  public void canGetPrice() {
    assertEquals(10, item.getPrice());
  }

  @Test
  public void canGetQuantity() {
    assertEquals(200, item.getQuantity());
  }

  @Test
  public void canBeBought() {
    item.getBought(3, customer, shop);
    assertEquals(197, item.getQuantity());
    assertEquals(70, customer.getMoney());
    assertEquals(53, customer.getPurchases());
    assertEquals(1030, shop.getMoney());
  }

  // @Test
  // public void canBeOutOfStock() {
  //   assertEquals("We only have 200 in stock.", item.getBought(210, customer, shop));
  // }

  // @Test
  // public void canBeRefunded() {
  //   item.getRefunded(3, shop, customer);
  //   assertEquals(203, item.getQuantity());
  //   assertEquals(130, customer.getMoney());
  //   assertEquals(47, customer.getPurchases());
  //   assertEquals(970, shop.getMoney());
  // }

  // @Test
  // public void cannotBeOverrefund() {
  //   assertEquals("You only bought 50 items.", item.getRefunded(60, shop, customer));
  // }

}
