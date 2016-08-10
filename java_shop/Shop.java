package java_shop;
import java.util.*;

public class Shop {

  private int money;
  private Item item;

  public Shop(int money, Item item) {
    this.money = money;
    this.item = item;
  }

  public int calculatetotalPrice(String name, int number) {
    if (item.getName() == name) {
      int totalPrice = item.getPrice() * number;
    }
    item.getQuantity() = item.getQuantity() - number;
    money = money + totalPrice;
    customer.getMoney() = customer.getMoney() - totalPrice;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public Item getItem() {
    return this.item;
  }

}
