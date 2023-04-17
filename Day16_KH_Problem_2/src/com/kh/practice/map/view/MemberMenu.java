package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
  private Scanner sc = new Scanner(System.in);
  private MemberController mc = new MemberController();

  public void mainMenu() {
    while (true) {
      System.out.println("========== KH 사이트 ==========");
      System.out.println("******* 메인 메뉴 *******");
      System.out.println("1. 회원가입");
      System.out.println("2. 로그인");
      System.out.println("3. 같은 이름 회원 찾기");
      System.out.println("9. 종료");

      int sel = -1;
      while (true) {
        try {
          System.out.println("메뉴 번호 선택: ");
          sel = sc.nextInt();
          break;
        } catch (Exception e) {
          System.out.println("숫자만 입력할 수 있습니다");
        } finally {
          sc.nextLine();
        }
      }

      switch (sel) {
        case 1 -> joinMembership();
        case 2 -> login();
        case 3 -> sameName();
        case 9 -> {
          System.out.println("프로그램 종료");
          return;
        }
        default -> {
          System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
        }
      }
    }
  }

  public void memberMenu() {
    boolean loopState = true;

    while (loopState) {
      System.out.println("""
          ******* 회원 메뉴 *******
          1. 비밀번호 바꾸기
          2. 이름 바꾸기
          3. 로그아웃
          """);

      int sel = -1;
      while (true) {
        try {
          System.out.println("메뉴 번호 선택: ");
          sel = sc.nextInt();
          break;
        } catch (Exception e) {
          System.out.println("숫자만 입력할 수 있습니다");
        } finally {
          sc.nextLine();
        }
      }

      switch (sel) {
        case 1 -> changePassword();
        case 2 -> changeName();
        case 3 -> {
          System.out.println("로그아웃 되었습니다");
          loopState = false;
        }
        default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
      }
    }
  }

  public void joinMembership() {
    while (true) {
      System.out.println("ID 입력: ");
      String id = sc.next();
      sc.nextLine();

      System.out.println("비밀번호 입력: ");
      String pw = sc.nextLine();

      System.out.println("이름 입력: ");
      String name = sc.nextLine();

      Member newMember = new Member(pw, name);

      if (mc.joinMembership(id, newMember)) {
        System.out.println("성공적으로 회원가입 완료하였습니다.");
        break;
      } else {
        System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
      }
    }
  }

  public void login() {
    while (true) {
      System.out.println("ID 입력: ");
      String id = this.sc.next();
      this.sc.nextLine();

      System.out.println("비밀번호 입력: ");
      String pw = this.sc.nextLine();

      String result = this.mc.login(id, pw);

      if (result != null) {
        System.out.println(result + "님, 환영합니다!");
        memberMenu();
        break;
      }

      System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
    }

  }

  public void changePassword() {
    while (true) {
      System.out.println("ID 입력: ");
      String id = this.sc.next();
      this.sc.nextLine();

      System.out.println("비밀번호 입력: ");
      String pw = this.sc.nextLine();

      System.out.println("변경할 비밀번호 입력: ");
      String newPw = this.sc.nextLine();

      if (this.mc.changePassword(id, pw, newPw)) {
        System.out.println("비밀번호 변경에 성공했습니다.");
        break;
      }

      System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
    }
  }

  public void changeName() {
    while (true) {
      System.out.println("ID 입력: ");
      String id = this.sc.next();
      this.sc.nextLine();

      System.out.println("비밀번호 입력: ");
      String pw = this.sc.nextLine();

      String result = this.mc.login(id, pw);

      if (result != null) {
        System.out.println("새로운 이름 입력: ");
        String newName = this.sc.nextLine();

        this.mc.changeName(id, newName);
        System.out.println("이름 변경에 성공하였습니다.");
        break;
      }

      System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
    }
  }

  public void sameName() {
    System.out.println("검색할 이름 입력: ");
    String name = this.sc.nextLine();

    TreeMap<String, String> results = this.mc.sameName(name);

    if (!results.isEmpty()) {
      for (Entry<String, String> nameSet : results.entrySet()) {
        System.out.println(nameSet.getKey() + "-" + nameSet.getValue());
      }
    } else {
      System.out.println("결과가 없습니다");
    }
  }
}
