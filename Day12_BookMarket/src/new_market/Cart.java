package new_market;

import java.util.Arrays;

public class Cart implements CartInterface {
  public static final int NUM_BOOK = 3;
  private CartItem[] mCartItem = new CartItem[NUM_BOOK];
  private static int mCartCount = 0;

  public Cart() {}

  @Override
  public void printBookList(Book[] bookList) {
    for (Book book : bookList) {
      System.out.println(book);
    }
  }

  @Override
  public boolean isCartInBook(String id) {
    return false;
  }

  @Override
  public void insertBook(Book p) {
    this.mCartItem[mCartCount++] = new CartItem(p, 1);
  }

  @Override
  public void removeCart(int numId) {
    for (int i = 0; i < this.mCartItem.length; i++) {
      Item item = this.mCartItem[i].getItem();
    }
  }

  @Override
  public void deleteBook() {
    Arrays.fill(this.mCartItem, null);
  }
}
