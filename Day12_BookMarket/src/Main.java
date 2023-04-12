import java.util.Scanner;

public class Main {
  Person person = null;
  public static Scanner sc = new Scanner(System.in);
  //  ArrayList<Item> items = new ArrayList<>();
  Cart cart = new Cart();

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
        case 2 -> {
          //          System.out.println("2. 장바구니 상품 목록 보기");
          m.menuCertItemList();
        }
        case 3 -> {
          //          System.out.println("3. 장바구니 비우기");
          m.menuCartClear();
        }
        case 4 -> {
          //          System.out.println("4. 바구니에 항목 추가하기");
          m.menuCartAddItem();
        }
        case 5 -> {
          //          System.out.println("5. 장바구니의 항목 수량 줄이기");
          m.menuCartRemoveItemCount();
        }
        case 6 -> {
          //          System.out.println("6. 장바구니의 항목 삭제하기");
          m.menuCartRemoveItem();
        }
        case 7 -> {
          m.menuCartBill();
          //          System.out.println("7. 영수증 표시하기");
        }
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
    String name = sc.next();

    System.out.println("연락처를 입력하세요");
    String phoneNumber = sc.next();

    System.out.println("주소를 입력하세요");
    String address = sc.next();

    person = new Person(name, phoneNumber, address);

    CartItem[] initialItems = new CartItem[] {
        new CartItem("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영",
            "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/08"),
        new CartItem("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서",
            "2022/01/22"),
        new CartItem("ISBN220913101957", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문",
            "2019/06/10")};

    cart.addItems(initialItems);
  }

  public void menuGuestInfo() {
    System.out.println("현재 고객 정보:");
    System.out.println("이름: " + person.getName() + "    연락처: " + person.getPhoneNumber());
  }

  public void menuCertItemList() {
    cart.printCart();

    /*
     * ISBN1234 | 쉽게 배우는 JSP 웹 프로그래밍 | 27000 | 송미영 | 단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 | IT전문서 | 2018/10/08
     * ISBN1235 | 안드로이드 프로그래밍 | 33000 | 우재남 | 실습 단계별 명쾌한 멘토링! | IT전문서 | 2022/01/22
     * ISBN220913101957 | 스크래치 | 22000 | 고광일 | 컴퓨팅 사고력을 키우는 블록 코딩 | 컴퓨터입문 | 2019/06/10
     */
  }

  public void menuCartClear() {
    cart.clear();

    System.out.println("장바구니를 비웠습니다");
  }

  public void menuCartAddItem() {
    System.out.println("추가할 상품을 입력해주세요");
    System.out.println("책번호|제목|금액|저자|설명|서적종류|날짜(yyyy/mm/dd)");
    System.out.println("\"|\"를 이용해서 구분해 입력해 주시기 바랍니다");

    String input = sc.nextLine();
    String[] splitResult = input.split("|");

    cart.addItem(new CartItem(splitResult));
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

/*
 * 고객들의 정보를 저장하는 클래스 Person.java
 *   이름, 핸드폰, 주소 모두 받고 모두 비공개 (private)
 */

/*
 * 장바구니 클래스 생성 (모든 변수 비공개) CartItem.java
 *   책의 제목을 저장하는 배열 (사이즈 7개): itemBook
 *   책의 번호: bookID
 *   총 구매액: totalPrice
 *   책의 개수: quantity
 */
