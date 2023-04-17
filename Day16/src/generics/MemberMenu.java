package generics;

import java.util.Scanner;

public class MemberMenu {
  private Scanner sc = new Scanner(System.in);
  private MemberController mc = new MemberController();

  public void mainMenu() {
    System.out.println("""
        ======== KH 사이트 ========
        ******** 메인 메뉴 ********
        """);

    System.out.println("1. 회원가입"); // joinMembership(); // 실행
    System.out.println("2. 로그인"); // login() 실행 후 memberMenu() 실행
    System.out.println("3. 같은 이름 회원 찾기"); // sameName()
    System.out.println("9. 종료"); // 프로그램 종료 후 main

    // next(): 공백 불가
    // nextLine(): 공백 허용
    //   엔터 처리

    System.out.print(">");
    int key = sc.nextInt(); //10엔터
    sc.nextLine(); // 기존 버퍼의 엔터를 지운다

    switch (key) {
      case 1:
        joinMembership();
        break;

      case 2:
        login();
        memberMenu();
        break;

      case 3:
        sameName();
        break;

      case 9:
        System.out.println("프로그램 종료!");
        return;

      default:
        break;
    }
  }

  public void memberMenu() {

  }

  public void joinMembership() {
    // 컨트롤러는 저장하고 true 또는 false
    System.out.println("id pw >");
    String[] str = sc.nextLine().split(" ");
    //    String name = sc.nextLine();
    //    String pw = sc.nextLine();

    Member temp = new Member(str[0], str[1]);

    // 실제 컨트롤러에 저장하는 내용
    boolean res = mc.joinMembership(str[0], temp);
    if (res) {
      System.out.println("가입이 완료되었습니다");
    } else {
      System.out.println("가입이 완료되지 않았습니다");
    }

  }

  public void login() {

  }

  public void changePassword() {

  }

  public void changeName() {

  }

  public void sameName() {

  }
}
