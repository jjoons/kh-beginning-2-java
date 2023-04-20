package new_market;

public class CartItem {
  private static int currentCartNumber = 1;
  private Book book;
  private int count;
  private final int numId = currentCartNumber++;

  public CartItem() {}

  public CartItem(Book book, int count) {
    this.book = book;
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public Book getItem() {
    return this.book;
  }
}
