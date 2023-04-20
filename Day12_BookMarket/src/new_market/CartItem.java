package new_market;

public class CartItem {
  private Item item;
  private int count;

  public CartItem() {}

  public CartItem(Item item, int count) {
    this.item = item;
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}

/*  public int getTotalPrice() {
    return this.item.getUnitPrice() * this.count;
  }

  public String getBookId() {
    return this.book.getBookId();
  }

  public void setBookId(String bookId) {
    this.book.setBookId(bookId);
  }

  public String getName() {
    return this.book.getName();
  }

  public void setName(String name) {
    this.book.setName(name);
  }

  public int getUnitPrice() {
    return this.book.getUnitPrice();
  }

  public void setUnitPrice(int unitPrice) {
    this.book.setUnitPrice(unitPrice);
  }

  public String getAuthor() {
    return this.book.getAuthor();
  }

  public void setAuthor(String author) {
    this.book.setAuthor(author);
  }

  public String getDescription() {
    return this.book.getDescription();
  }

  public void setDescription(String description) {
    this.book.setDescription(description);
  }

  public String getCategory() {
    return this.book.getCategory();
  }

  public void setCategory(String category) {
    this.book.setCategory(category);
  }

  public String getReleaseDate() {
    return this.book.getReleaseDate();
  }

  public void setReleaseDate(String releaseDate) {
    this.book.setReleaseDate(releaseDate);
  }*/
