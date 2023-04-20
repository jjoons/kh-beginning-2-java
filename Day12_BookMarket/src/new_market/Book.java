package new_market;

public class Book extends Item {
  private String bookId;
  private String author;
  private String description;
  private String category;
  private String releaseDate;

  public Book(String name, int price, String bookId, String author, String description, String category, String releaseDate) {
    super(name, price);
    this.bookId = bookId;
    this.author = author;
    this.description = description;
    this.category = category;
    this.releaseDate = releaseDate;
  }

  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return this.bookId + " | " + this.name + " | " + this.price + " | " + this.author + " | " + this.description + " | " + this.category + " | " + this.releaseDate;
  }
}
