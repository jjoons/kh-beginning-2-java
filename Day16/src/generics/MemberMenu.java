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

    int sel = sc.nextInt();

    switch (sel) {
      case 1:
        joinMembership();
        break;

      case 2:
        memberMenu();
        break;

      case 3:
        sameName();
        break;

      default:
        break;
    }
  }

  public void memberMenu() {

  }

  public void joinMembership() {

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
