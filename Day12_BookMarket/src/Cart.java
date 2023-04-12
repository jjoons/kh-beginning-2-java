import java.util.ArrayList;

public class Cart {
  private ArrayList<CartItem> itemBook = new ArrayList<>();
  private int totalPrice;

  public void printCart() {
    for (Item item : itemBook) {
      System.out.println(item);
    }
  }

  public boolean addItem(CartItem item) {
    return this.itemBook.add(item);
  }

  public boolean addItems(CartItem[] items) {
    boolean returnValue = true;

    for (CartItem item : items) {
      if (!this.addItem(item))
        returnValue = false;
    }

    return returnValue;
  }

  public Item removeItem(int index) {
    return this.itemBook.remove(index);
  }

  public void clear() {
    this.itemBook.clear();
  }

  public int getQuantity() {
    return this.itemBook.size();
  }
}
