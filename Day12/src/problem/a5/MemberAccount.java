package problem.a5;

import java.util.Scanner;

public class MemberAccount {
  String no; // 계좌번호
  String name; // 예금주
  int money; // 잔액
  int password; // 비밀번호
  Scanner sc = new Scanner(System.in);

  public MemberAccount(String no, String name, int money, int password) {
    this.no = no;
    this.name = name;
    this.money = money;
    this.password = password;
  }

  // 예금
  public int deposit(int depositMoney) {
    return this.money += depositMoney;
  }

  public int withdraw(int withdrawMoney) throws Exception {
    withdrawMoney *= 10000;

    if (this.money < withdrawMoney) {
      throw new Exception("한도 초과");
    }

    return this.money -= withdrawMoney;
  }

  public void check() throws Exception {
    System.out.println("비밀번호 입력: ");
    int inputPw = sc.nextInt();

    if (this.password != inputPw) {
      throw new Exception("비밀번호가 맞지 않습니다");
    }

    System.out.println("만원 단위로 출금할 금액 입력: ");
    int inputMoney = sc.nextInt();

    this.withdraw(inputMoney);

    System.out.println(inputMoney + "원을 출금했습니다");
    System.out.println("남은 잔액: " + this.money);
  }

  class CheckCard extends MemberAccount {
    private String cardNumber;
    private int cardPassword;

    public CheckCard(String no, String name, int money, int password, String cardNumber,
        int cardPassword) {
      super(no, name, money, password);
      this.cardNumber = cardNumber;
      this.cardPassword = cardPassword;
    }

    public void pay() throws Exception {
      System.out.println("카드로 결제합니다");

      System.out.println("만원 단위로 결제할 금액 입력: ");
      int inputValue = sc.nextInt();

      this.withdraw(inputValue);

      System.out.println("결제 완료");
      System.out.println("남은 잔액: " + this.money);
    }
  }

}
