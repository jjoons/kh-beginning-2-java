public class CartItem extends Item {
  private int count = 1;

  public CartItem(String bookID, String title, int price, String author, String description,
      String type, String date) {
    super(bookID, title, price, author, description, type, date);
  }

  public CartItem(String bookID, String title, int price, String author, String description,
      String type, String date, int count) {
    super(bookID, title, price, author, description, type, date);
    this.count = count;
  }

  public CartItem(String[] arr) throws NumberFormatException {
    super(arr);
  }

  public CartItem(String[] arr, int count) throws NumberFormatException {
    super(arr);
    this.count = count;
  }

  /**
   * 이 상품의 개수만큼의 전체 금액 얻기
   * 
   * @return
   */
  public int getTotalPrice() {
    return this.getPrice() * this.count;
  }

  /**
   * 수량 감소
   * 
   * @return
   */
  public int decreaseCount() {
    return --this.count;
  }

  /**
   * 수량 증가
   * 
   * @return
   */
  public int increaseCount() {
    return ++this.count;
  }
}
