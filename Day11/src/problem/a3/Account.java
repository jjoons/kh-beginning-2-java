package problem.a3;

import java.util.Scanner;

public class Account extends Thread {
  private String name; // 계좌명
  private int pw; // 비밀번호
  private int money = 1_000_000; // 잔액
  public Scanner scanner = new Scanner(System.in);

  public Account(String name, int pw) {
    this.name = name;
    this.pw = pw;
  }

  // 출금 함수명 withd
  // 매개 변수는 접근하는 사람의 이름, 비밀번호
  // 기능: 비밀번호가 맞으면 출금액 입력받고
  //       출금액이 기존 돈보다 많지 않으면 출금하고
  //       기존 돈보다 출금액이 많으면 "한도초과 출금 안됨"
  public void withd(String name, int pw) {
    if (this.pw != pw) {
      System.out.println("비밀번호가 다릅니다");
      return;
    }

    System.out.println("현재 잔액: " + this.money + "출금할 금액 입력: ");
    int inputValue = this.scanner.nextInt();

    if (inputValue <= this.money) {
      this.money -= inputValue;
      System.out.println("남은 잔액: " + this.money);
    } else {
      System.out.println("한도초과 출금안됨");
    }
  }

  @Override
  public void run() {
    this.withd(name, pw);
  }
}


// class ATM
//   엄마가 10만원을 출금하면 내 통장의 돈은 90만원
//   아빠가 20만원 출금하면 내 통장의 돈은 70만원
//   내가 30만원 출금하면 내 통장의 돈은 40만원
class ATM {
  private Account a; // 고객 정보받는 참조 변수
  private String name; // 이용하는 사람의 정보

  public ATM(Account a, String name) {
    this.a = a;
    this.name = name;
  }

  public void withdraw() {

  }
}
