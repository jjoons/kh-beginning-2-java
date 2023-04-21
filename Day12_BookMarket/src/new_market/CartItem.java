package new_market;

import java.util.Objects;

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

  public int calcTotalPrice() {
    return this.book.getPrice() * this.count;
  }

  public int getNumId() {
    return this.numId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartItem cartItem = (CartItem) o;
    return Objects.equals(book, cartItem.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(book);
  }
}
