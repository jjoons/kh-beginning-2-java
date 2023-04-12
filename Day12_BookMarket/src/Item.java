
public class Item {
  private String bookID;
  private String title;
  private int price;
  private String author;
  private String description;
  private String type;
  private String date;

  public Item(String bookID, String title, int price, String author, String description,
      String type, String date) {
    this.bookID = bookID;
    this.title = title;
    this.price = price;
    this.author = author;
    this.description = description;
    this.type = type;
    this.date = date;
  }

  public Item(String[] arr) throws NumberFormatException {
    this.bookID = arr[0];
    this.title = arr[1];
    this.price = Integer.parseInt(arr[2]);
    this.author = arr[3];
    this.description = arr[4];
    this.type = arr[5];
    this.date = arr[6];
  }

  @Override
  public String toString() {
    return String.format("%s | %s | %d | %s | %s | %s | %s", this.bookID, this.title, this.price,
        this.author, this.description, this.type, this.date);
  }

  public String getBookID() {
    return bookID;
  }

  public String getTitle() {
    return title;
  }

  public int getPrice() {
    return price;
  }

  public String getAuthor() {
    return author;
  }

  public String getDescription() {
    return description;
  }

  public String getType() {
    return type;
  }

  public String getDate() {
    return date;
  }
}

