package new_market;

import java.util.ArrayList;

public class Cart implements CartInterface {
  private ArrayList<CartItem> mCartItem = new ArrayList<>();

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
  public void insertBook(Book book) {
    String bookId = book.getBookId();

    if (this.isCartInBook(bookId)) {
      CartItem cartItem = this.findCartItemByBookId(bookId);
      cartItem.increase();
    } else {
      this.mCartItem.add(new CartItem(book, 1));
    }
  }

  @Override
  public void removeCart(int numId) {
    for (int i = 0; i < this.mCartItem.size(); i++) {
      if (this.mCartItem.get(i).getNumId() == numId) {
        this.mCartItem.remove(i);
      }
    }
  }

  @Override
  public void deleteBook() {
    this.mCartItem.clear();
  }

  public void printCartList() {
    if (this.mCartItem.size() <= 0) {
      System.out.println("장바구니가 비어있습니다");
    } else {
      System.out.println("장바구니 상품 목록: ");
      System.out.println("-----------------------------------");
      System.out.println("     도서 ID     |     수량     |     합계");

      int totalPrice = 0;

      for (CartItem item : this.mCartItem) {
        if (item != null) {
          totalPrice += item.calcTotalPrice();
          Book book = item.getItem();
          System.out.printf("     %s     |     %d     |     %d", book.getBookId(), item.getCount(), item.calcTotalPrice());
          System.out.println();
        }
      }

      System.out.println("-----------------------------------");
      System.out.println("                    주문 총 금액: " + totalPrice);
      System.out.println("-----------------------------------");
    }
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

  public CartItem findCartItemByBookId(String bookId) {
    for (CartItem cartItem : this.mCartItem) {
      if (cartItem.getItem().getBookId().equals(bookId)) {
        return cartItem;
      }
    }

    return null;
  }

  public boolean decreaseItemCount(String bookId) {
    CartItem cartItem = this.findCartItemByBookId(bookId);

    if (cartItem != null && cartItem.getCount() > 1) {
      cartItem.decrease();
      return true;
    }

    return false;
  }

  public boolean isEmpty() {
    return this.mCartItem.isEmpty();
  }
}
