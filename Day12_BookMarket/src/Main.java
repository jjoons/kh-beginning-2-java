import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  String name;
  String phoneNumber;
  public static Scanner sc = new Scanner(System.in);
  ArrayList<Item> items = new ArrayList<>();

  public static void main(String[] args) {
    Main m = new Main();
    boolean loopState = true;

    while (loopState) {
      System.out.println("""
          *************************************************************
                          Welcome to Shopping Mall
                          Welcome to Book Market!
          *************************************************************
           1. 고객 정보 확인하기        4. 바구니에 항목 추가하기
           2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기
           3. 장바구니 비우기           6. 장바구니의 항목 삭제하기
           7. 영수증 표시하기           8. 종료
          *************************************************************
          """);

      System.out.println("메뉴 번호를 선택해주세요");
      int select = sc.nextInt();

      System.out.println(select + "번을 선택했습니다");

      switch (select) {
        case 1 -> {
          m.menuGuestInfo();
        }
        case 2 -> System.out.println("2. 장바구니 상품 목록 보기");
        case 3 -> System.out.println("3. 장바구니 비우기");
        case 4 -> System.out.println("4. 바구니에 항목 추가하기");
        case 5 -> System.out.println("5. 장바구니의 항목 수량 줄이기");
        case 6 -> System.out.println("6. 장바구니의 항목 삭제하기");
        case 7 -> System.out.println("7. 영수증 표시하기");
        case 8 -> {
          loopState = false;
          System.out.println("프로그램을 종료합니다");
        }
        default -> {
          System.out.println("번호를 잘못 입력했습니다");
        }
      }
    }
  }

  public Main() {
    System.out.println("당신의 이름을 입력하세요");
    name = sc.next();

    System.out.println("연락처를 입력하세요");
    phoneNumber = sc.next();
  }

  public void menuGuestInfo() {
    System.out.println("현재 고객 정보:");
    System.out.println("이름: " + this.name + "    연락처: " + this.phoneNumber);
  }

  public void menuCertItemList() {
    System.out.println("상품명 / 금액 / 수량");

    for (Item item : items) {
      System.out.println(item);
    }
  }

  public void menuCartClear() {
    items.clear();
  }

  public void menuCartAddItem() {

  }

  public void menuCartRemoveItemCount() {

  }

  public void menuCartRemoveItem() {

  }

  public void menuCartBill() {

  }

  public void menuExit() {

  }
}
// (메뉴 출력) 1번 선택
//   현재 고객 정보:
//     이름 이서희   연락처 1111

// 메뉴를 잘못 선택했을경우
//   1부터 8까지의 숫자를 입력하세요
