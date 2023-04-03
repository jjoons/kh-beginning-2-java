import java.util.Scanner;

class Ex07 {
  private Scanner sc = new Scanner(System.in);
  private int[] seat = new int[7];
  private int money = 0;

  private boolean isReservation(int index) {
    return this.seat[index] == 0;
  }

  // 1번 누르면 예매, 2번 종료
  public void showMenu() {
    // 화면에 예약 자리 출력: 0 빈공간, 1 예약 자리

    System.out.println("[MEGA MOVIE]");
    System.out.println("[1]좌석예매");
    System.out.println("[2]종료하기");

    System.out.print("메뉴 선택 : ");
    int sel = sc.nextInt();

    if (sel == 1) {
      // 빈 자리면 예약

      // 비어있지 않은 자리일 경우 "예약할 수 없습니다"
      System.out.println("좌석번호 입력: ");
      sel = sc.nextInt();

      if (isReservation(sel)) {
        System.out.println("예약");
        this.choiceSeat();
      } else {
        System.out.println("예약할 수 없습니다");
      }
    } else if (sel == 2) {
      System.out.println("");
    }
  }

  // 자리를 표시하는 함수
  public void showSeat() {
    System.out.print("seat = ");

    for (int i : this.seat) {
      System.out.print(i + " ");
    }
  }

  // 좌석을 예매하는 명령문을 담은 함수
  public void choiceSeat() {
    System.out.println("좌석 선택: ");
    int sel = sc.nextInt();

    if (sel < 0 || sel >= this.seat.length) {
      System.out.println("이미 예매가 완료된 자리입니다");
    }
  }

  // 총 매출액을 출력하는 함수
  public void showSales() {
    System.out.println("매출액 : " + this.money + "원");
  }
}

/*
 * showMenu() -> 1번 누르면 예매, 2번 종료
 * showSeat() -> 자리를 표시하는 함수
 * choiceSeat() -> 좌석을 예매하는 명령문을 담은 함수
 * showSales() -> 총 매출액을 출력하는 함수
 */


// day0107_클래스영화관예메문제
public class Movie {
  public static void main(String[] args) {
    /*
     * # 영화관 좌석예매 : 클래스 + 변수
     * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
     * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
     * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
     * 4. 한 좌석당 예매 가격은 12000원이다.
     * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
     * 
     * 예)
     * seat = 0 0 0 0 0 0 0
     * 
     * 좌석선택 : 1
     * seat = 0 1 0 0 0 0 0
     * 
     * 좌석선택 : 3
     * seat = 0 1 0 1 0 0 0
     * 
     * 좌석선택 : 3
     * seat = 0 1 0 1 0 0 0
     * 이미 예매가 완료된 자리입니다.
     * ----------------------
     * 매출액 : 24000원
     */

    Scanner scan = new Scanner(System.in);

    Ex07 e = new Ex07();

    while (true) {
      // 화면에 예약 자리 출력: 0 빈공간, 1 예약 자리

      System.out.println("[MEGA MOVIE]");
      System.out.println("[1]좌석예매");
      System.out.println("[2]종료하기");

      System.out.print("메뉴 선택 : ");
      int sel = scan.nextInt();

      if (sel == 1) {
        // 빈 자리면 예약

        // 비어있지 않은 자리일 경우 "예약할 수 없습니다"
        System.out.println("좌석번호 입력: ");
        int inputSeat = scan.nextInt();

      } else if (sel == 2) {
        break;
      }
    }
  }
}
