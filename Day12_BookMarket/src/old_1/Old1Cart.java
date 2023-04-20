package old_1;
import java.util.ArrayList;

public class Old1Cart {
  private ArrayList<Old1CartItem> itemBook = new ArrayList<>();
  private int totalPrice;

  public void printCart() {
    for (Old1Item item : itemBook) {
      System.out.println(item);
    }
  }

  public boolean addItem(Old1CartItem item) {
    return this.itemBook.add(item);
  }

  public boolean addItems(Old1CartItem[] items) {
    boolean returnValue = true;

    for (Old1CartItem item : items) {
      if (!this.addItem(item))
        returnValue = false;
    }

    return returnValue;
  }

  public Old1Item removeItem(int index) {
    return this.itemBook.remove(index);
  }

  public void clear() {
    this.itemBook.clear();
  }

  public int getQuantity() {
    return this.itemBook.size();
  }
}
