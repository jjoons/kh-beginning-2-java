package problem.a2;

import java.util.Random;
import java.util.Scanner;

public class KakaoTaxi {
  /*
   * # 카카오 택시
   * 1. 손님을 태워 목적지까지 이동하는 게임이다.
   * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
   * 3. 메뉴는 아래와 같다.
   *      1) 속도설정 : 1~3까지만 가능
   *      2) 방향설정 : 동(1)서(2)남(3)북(4)
   *      3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
   * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
   *
   */

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Random r = new Random();

    // 목적지(destination)
    int desX = r.nextInt(-10, 11);
    int desY = r.nextInt(-10, 11);

    // 현재 위치
    int x = 0;
    int y = 0;

    // 방향(direction)
    int dir = 0;

    // 속도
    int speed = 0;

    // 요금
    int fee = 0;

    boolean run = true;
    while (run) {

      System.out.println("= 카카오 택시 =");
      System.out.println("목적지 : " + desX + "," + desY);
      System.out.println("현위치 : " + x + "," + y);
      System.out.println("방   향 : " + dir);
      System.out.println("속   도 : " + speed);
      System.out.println("============");

      System.out.println("1.방향설정");
      System.out.println("2.속도설정");
      System.out.println("3.이동하기");

      System.out.print("메뉴 선택 : ");
      int sel = scan.nextInt();

      if (sel == 1) {
        while (true) {
          System.out.println("동: 1, 서: 2, 남: 3, 북: 4");
          System.out.println("방향 입력: ");
          int inputDirection = scan.nextInt();

          if (inputDirection > 4 || inputDirection < 1) {
            System.out.println("1부터 4까지의 숫자만 입력할 수 있습니다");
          } else {
            dir = inputDirection;
            break;
          }
        }
      } else if (sel == 2) {
        while (true) {
          System.out.println("속도 입력");
          int inputSpeed = scan.nextInt();

          if (inputSpeed > 3 || inputSpeed < 1) {
            System.out.println("속도는 1부터 3까지의 숫자만 입력할 수 있습니다");
          } else {
            speed = inputSpeed;
            break;
          }
        }

      } else if (sel == 3) {
        switch (dir) {
          case 1 -> x += speed;
          case 2 -> x -= speed;
          case 3 -> y -= speed;
          case 4 -> y += speed;
          default -> {
            System.out.println("알 수 없는 방향입니다: " + dir);
          }
        }

        if (dir <= 4 && dir >= 1)
          fee += 50 * speed;

        if (desX == x && desY == y) {
          System.out.println("목적지에 도착했습니다");
          System.out.println("요금: " + fee);
          run = false;
        }
      }

    }



  }
}
