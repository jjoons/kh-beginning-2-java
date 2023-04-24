package new_market;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Controller {
  public static final String DELIM = "|";
  private ArrayList<Book> books = new ArrayList<>();
  private File file = new File("io/book.txt");
  //  private FileInputStream fis = null;
//  private BufferedInputStream bis = null;
//  private FileOutputStream fos = null;
//  private BufferedOutputStream bos = null;
  private FileReader fr = null;
  private FileWriter fw = null;
  private BufferedReader br = null;
  private BufferedWriter bw = null;

  public Controller() throws IOException {
    boolean successCreateFile = this.file.createNewFile();

    if (!this.file.canRead() || !this.file.canWrite()) {
      throw new IOException("파일을 읽거나 쓸 수 없습니다");
    }

    this.fr = new FileReader(this.file);
    this.fw = new FileWriter(this.file, true);

    this.br = new BufferedReader(this.fr);
    this.bw = new BufferedWriter(this.fw);

    if (successCreateFile) {
      this.books.addAll(List.of(new Book[]{
        new Book("쉽게 배우는 JSP 웹 프로그래밍", 27000, "ISBN1234", "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍",
          "IT전문서", "2018/10/08"),
        new Book("안드로이드 프로그래밍", 33000, "ISBN1235", "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22"),
        new Book("스크래치", 22000, "ISBN1236", "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문서", "2019/06/10"),
      }));

      this.save();
      this.books.clear();
    }

    this.open();
  }

  public boolean open() throws IOException {
    ArrayList<Book> newBooks = new ArrayList<>();
    String a;

    while ((a = this.br.readLine()) != null) {
      try {
        StringTokenizer st = new StringTokenizer(a, "|");

        if (st.countTokens() != 7) {
          System.out.println();
          return false;
        }

        String bookId = st.nextToken();
        String bookName = st.nextToken();
        int price = Integer.parseInt(st.nextToken());
        String author = st.nextToken();
        String description = st.nextToken();
        String category = st.nextToken();
        String releaseDate = st.nextToken();

        Book newBook = new Book(bookName, price, bookId, author, description, category, releaseDate);
        newBooks.add(newBook);
      } catch (NumberFormatException e) {
        return false;
      }
    }

    for (Book book : newBooks) {
      this.books.add(book);
    }

    this.br.mark(0);
    this.br.reset();

    return true;
  }

  public boolean save() {
    try {
      new FileOutputStream(this.file).close();
    } catch (IOException e) {
      return false;
    }

    StringBuffer sb = new StringBuffer();

    for (Book book : this.books) {
      if ((book.getName() + book.getBookId() + book.getAuthor() + book.getCategory()
        + book.getDescription() + book.getReleaseDate()).contains(DELIM)) {
        return false;
      }

      String saveDesc = book.getBookId() + DELIM + book.getName() + DELIM + book.getPrice() + DELIM
        + book.getAuthor() + DELIM + book.getDescription() + DELIM + book.getCategory() + DELIM + book.getReleaseDate();

      try {
        this.bw.write(saveDesc);
        this.bw.newLine();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    try {
      this.bw.flush();
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }

    return true;
  }

  public boolean isBookInList(String id) {
    for (Book book : books) {
      if (book.getBookId().equals(id)) {
        return true;
      }
    }

    return false;
  }

  public Book getBookById(String bookId) {
    for (Book book : books) {
      if (book.getBookId().equals(bookId)) {
        return book;
      }
    }

    return null;
  }

  public void addBook(Book book) {
    this.books.add(book);
    this.save();
  }

  /**
   * 전체 도서 정보 목록을 출력하는 메서드
   */
  public void printBookList() {
    for (Book book : this.books) {
      System.out.println(book);
    }
  }
}
