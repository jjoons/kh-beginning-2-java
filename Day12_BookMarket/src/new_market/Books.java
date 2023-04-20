package new_market;

public class Books {
  private Book[] books;

  public Books(Book[] books) {
    this.books = books;
  }

  public boolean isBookInList(String id) {
    for (Book book : books) {
      if (book.getBookId().equals(id)) {
        return true;
      }
    }

    return false;
  }
}
