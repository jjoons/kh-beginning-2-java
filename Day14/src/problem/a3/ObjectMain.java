package problem.a3;

import java.util.Scanner;

public class ObjectMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    User u1 = new User("qwer", "qwer");

    System.out.println("ID 입력: ");
    String inputId = sc.next();

    System.out.println("비밀번호 입력: ");
    String inputPw = sc.next();

    User tryUser = new User(inputId, inputPw);
    System.out.println(inputId);
    System.out.println(inputPw);

    if (u1.equals(tryUser)) {
      System.out.println("로그인 성공입니다 " + tryUser.getId() + "님 환영합니다");
    } else {
      System.out.println("아이디 또는 비밀번호를 확인하세요");
    }
  }
}
