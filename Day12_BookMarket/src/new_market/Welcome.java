package new_market;

import util.InputFromUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {
  private CartItem[][] mBook;
  private final Scanner sc = new Scanner(System.in);
  private final InputFromUser in = new InputFromUser(sc);
  private final Cart cart = new Cart();

  public static void main(String[] args) {
    Book[] books = new Book[]{
      new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/08"),
      new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22"),
      new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문서", "2019/06/10")
    };
  }

  public void mainMenu() {
    System.out.println("이름 입력: ");
    String name = this.sc.nextLine();

    System.out.println("폰 번호 입력: ");
    String phoneNumber = this.sc.nextLine();


    // 2차원 배열로 어떻게 하라는건지 모르겠음..
    this.mBook = new CartItem[][]{
      {new CartItem()},
      {new CartItem(), new CartItem()}
    };

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
        case 5 -> this.menuCartRemoveItemCount();
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

  }

  /**
   * 장바구니 상품 목록 보기
   */
  public void menuCartItemList() {

    System.out.println("장바구니 상품 목록: ");
    System.out.println("-----------------------------------");

//    this.cart.printBookList();

    System.out.println("-----------------------------------");
  }

  public void menuCartClear() {}

  public void menuCartAddItem() {}

  public void menuCartRemoveItemCount() {}

  public void menuCartRemoveItem() {}

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

    if (!printYn) return;

  }

  public void menuExit() {}

  public void menuAdmin() {}
}
