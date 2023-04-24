package new_market;

import java.util.Arrays;

public class Cart implements CartInterface {
  public static final int NUM_BOOK = 3;
  private CartItem[] mCartItem = new CartItem[NUM_BOOK];
  private static int mCartCount = 0;

  public Cart() {}

  @Override
  public boolean isCartInBook(String bookId) {
    for (CartItem item : this.mCartItem) {
      Book book = item.getItem();
      if (book.getBookId().equals(bookId)) {
        return true;
      }
    }

    return false;
  }

  @Override
  public boolean insertBook(Book book) {
    if (!this.isFull()) {
      String bookId = book.getBookId();
      if (this.isCartInBook(bookId)) {
        CartItem cartItem = this.findCartItemByBookId(bookId);
        cartItem.increase();
      } else {
        this.mCartItem[mCartCount++] = new CartItem(book, 1);
      }

      return true;
    }

    return false;
  }

  @Override
  public void removeCart(int numId) {
    for (int i = 0; i < this.mCartItem.length; i++) {
      if (this.mCartItem[i].getNumId() == numId) {
        this.mCartItem[i] = null;
        mCartCount--;
      }
    }
  }

  @Override
  public void deleteBook() {
    Arrays.fill(this.mCartItem, null);
    mCartCount = 0;
  }

  public void printCartList() {
    System.out.println("장바구니 상품 목록: ");
    System.out.println("-----------------------------------");
    System.out.println("     도서 ID     |     수량     |     합계");

    int totalPrice = 0;

    for (CartItem item : this.mCartItem) {
      if (item != null) {
        totalPrice += item.calcTotalPrice();
        Book book = item.getItem();
        System.out.printf("     %s     |     %d     |     %d", book.getBookId(), item.getCount(), item.calcTotalPrice());
      }
    }

    System.out.println("-----------------------------------");
    System.out.println("                    주문 총 금액: " + totalPrice);
    System.out.println("-----------------------------------");
  }

  public int findBookByBookId(String bookId) {
    for (CartItem item : this.mCartItem) {
      Book book = item.getItem();
      if (book.getBookId().equals(bookId)) {
        return item.getNumId();
      }
    }

    return -1;
  }

  public boolean isFull() {
    return mCartCount >= NUM_BOOK;
  }

  public CartItem findCartItemByBookId(String bookId) {
    for (CartItem cartItem : this.mCartItem) {
      if (cartItem.getItem().getBookId().equals(bookId)) {
        return cartItem;
      }
    }

    return null;
  }
}
