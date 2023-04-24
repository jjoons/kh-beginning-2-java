package new_market;

import util.InputFromUser;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {
  // TODO 미완
  private final Controller controller = new Controller();
  private final Scanner sc = new Scanner(System.in);
  private final InputFromUser in = new InputFromUser(sc);
  private final Cart cart = new Cart();
  private Customer customer = null;
  private Manager manager = new Manager("관리자1", "15880000", "admin", "admin");

  public Welcome() throws IOException {}

  public static void main(String[] args) throws IOException {
    new Welcome().mainMenu();
  }

  public void mainMenu() {
    System.out.println("이름 입력: ");
    String name = this.sc.nextLine();

    System.out.println("폰 번호 입력: ");
    String phoneNumber = this.sc.nextLine();

    this.customer = new Customer(name, phoneNumber);

    boolean loopState = true;

    while (loopState) {
      System.out.println("""
        *************************************************
                Welcome to Shopping Mall
                Welcome to Book Market!
        *************************************************
         1. 고객 정보 확인하기       4. 장바구니에 항목 추가하기
         2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기
         3. 장바구니 비우기          6. 장바구니의 항목 삭제하기
         7. 영수증 표시하기          8. 종료
         9. 관리자 로그인
        *************************************************
        """);

      Integer sel = null;
      try {
        in.setThrowMessage("올바르지 않은 메뉴 선택으로 종료합니다.");
        sel = in.integer(1, true, s -> s < 1 || s > 9);
      } catch (InputMismatchException e) {
        System.out.println(e.getMessage());
        System.exit(1);
      }

      switch (sel) {
        case 1 -> this.menuGuestInfo();
        case 2 -> this.menuCartItemList();
        case 3 -> this.menuCartClear();
        case 4 -> this.menuCartAddItem();
        case 5 -> {
          System.out.println("미완성");
//          this.menuCartRemoveItemCount();
        }
        case 6 -> this.menuCartRemoveItem();
        case 7 -> this.menuCartBill();
        case 8 -> {
          this.menuExit();
          loopState = false;
        }
        case 9 -> this.menuAdmin();
        default -> {
          System.out.println("올바르지 않은 메뉴 선택으로 종료합니다");
        }
      }
    }
  }

  /**
   * 고객 정보 확인하기
   */
  public void menuGuestInfo() {
    System.out.println("현재 고객 정보");
    System.out.println(this.customer);
  }

  /**
   * 장바구니 상품 목록 보기
   */
  public void menuCartItemList() {
    this.cart.printCartList();
  }

  /**
   * 장바구니 비우기
   */
  public void menuCartClear() {
    while (true) {
      System.out.println("장바구니의 항목을 삭제하시겠습니까? (Y / N) ");
      String yn = this.sc.next();
      this.sc.nextLine();

      if (yn.equalsIgnoreCase("y")) {
        System.out.println("장바구니의 모든 항목을 삭제했습니다");
        this.cart.deleteBook();
        break;
      } else if (yn.equalsIgnoreCase("n")) {
        System.out.println("장바구니 비우기를 취소했습니다");
        break;
      } else {
        System.out.println("'y' 또는 'n' 중에서 하나만 입력해 주시기 바랍니다");
      }
    }
  }

  /**
   * 바구니에 항목 추가하기
   */
  public void menuCartAddItem() {
    // TODO
    this.controller.printBookList();

    System.out.println("장바구니에 추가할 도서의 ID를 입력하세요: ");
    String bookId = this.sc.nextLine();

    Book findBook = this.controller.getBookById(bookId);
    if (findBook == null) {
      System.out.println("해당 ID를 가지고 있는 책이 없습니다.");
      return;
    }

    if (this.cart.insertBook(findBook)) {
      System.out.println("장바구니에 책을 넣었습니다");
    } else {
      System.out.println("장바구니에 책을 넣지 못 했습니다");
    }
  }

  /**
   * 장바구니의 항목 수량 줄이기
   */
  public void menuCartRemoveItemCount() {
    // TODO
    this.cart.printCartList();

    System.out.println("수량을 줄일 도서의 ID를 입력해주세요");

  }

  /**
   * 장바구니의 항목 삭제하기
   */
  public void menuCartRemoveItem() {
    this.cart.printCartList();

    System.out.println("장바구니에서 삭제할 도서의 ID를 입력하세요: ");
    String bookId = this.sc.nextLine();

    int findNumId = this.cart.findBookByBookId(bookId);

    if (this.cart.isCartInBook(bookId) && findNumId >= 1) {
      this.cart.removeCart(findNumId);
      System.out.println("삭제했습니다");
    } else {
      System.out.println("해당 도서 ID는 없습니다. 확인 후 다시 시도해 주시기 바랍니다");
    }
  }

  /**
   * 영수증 표시하기
   */
  public void menuCartBill() {
    boolean printYn = false;

    while (true) {
      System.out.println("배송받을 분이 고객 정보와 같습니까? Y | N: ");
      String yn = this.sc.next();

      if (yn.equalsIgnoreCase("y")) {
        printYn = true;
        break;
      } else if (yn.equalsIgnoreCase("n")) {
        break;
      } else {
        System.out.println("Y, N 중에 하나를 입력해 주시기 바랍니다");
      }
    }

    String name = this.customer.getName();
    String phoneNumber = this.customer.getPhoneNumber();

    if (!printYn) {
      System.out.println("배송받을 고객명을 입력하세요: ");
      name = this.sc.nextLine();

      System.out.println("배송받을 고객의 연락처를 입력하세요: ");
      phoneNumber = this.sc.next();
    }

    System.out.println("배송받을 고객의 배송지를 입력하세요: ");
    String shippingAddress = this.sc.nextLine();

    LocalDate localDateTime = LocalDate.now().plusDays(3L);
    String shippingDate = localDateTime.format(DateTimeFormatter.ofPattern("uuuu/MM/dd"));

    System.out.printf("""
      -------------------- 배송 받을 고객 정보 --------------------
      고객명: %s               연락처: %s
      배송지: %s               발송일: %s
      -------------------------------------------------------
      """, name, phoneNumber, shippingAddress, shippingDate);
  }

  public void menuExit() {
    System.out.println("이용해 주셔서 감사합니다");
  }

  public void menuAdmin() {
    System.out.println("관리자 정보를 입력하세요");

    System.out.println("아이디: ");
    String id = this.sc.next();

    System.out.println("비밀번호: ");
    String password = this.sc.nextLine();

    if (!this.manager.isMatch(id, password)) {
      System.out.println("아이디나 비밀번호가 일치하지 않습니다. 확인해 주세요");
    }

    boolean addBook = true;
    while (true) {
      System.out.println("도서 정보를 추가하겠습니까? (Y | N) ");
      String yn = this.sc.next();
      this.sc.nextLine();

      if (yn.equalsIgnoreCase("y")) {
        break;
      } else if (yn.equalsIgnoreCase("n")) {
        addBook = false;
        break;
      } else {
        System.out.println("Y / N 중에 하나만 입력해 주시기 바랍니다");
      }
    }

    if (!addBook) {
      System.out.println("이전 메뉴로 되돌아갑니다");
      return;
    }

    System.out.println("도서 ID: ");
    String bookId = this.sc.nextLine();

    System.out.println("도서명: ");
    String bookName = this.sc.nextLine();

    int price = this.in.integer("가격: ");

    System.out.println("저자: ");
    String author = this.sc.nextLine();

    System.out.println("설명: ");
    String description = this.sc.nextLine();

    System.out.println("분야: ");
    String category = this.sc.nextLine();

    System.out.println("출판일: ");
    String releaseDate = this.sc.nextLine();

    this.controller.addBook(new Book(bookName, price, bookId, author, description, category, releaseDate));
    System.out.println("책을 추가했습니다");
  }
}
