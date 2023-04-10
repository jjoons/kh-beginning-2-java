package problem.a3;

import java.util.Scanner;

public class Account2 {
  String name;
  int pinNumber;
  int money = 1000000;
  Scanner sc = new Scanner(System.in);

  public synchronized void withdraw(String name, int pinNumber) {
    System.out.println(name + "님이 출금합니다");

    if (this.pinNumber != pinNumber) {
      System.out.println("비밀번호가 다릅니다");
      return;
    }

    System.out.println("현재 잔액: " + this.money);
    System.out.println("출금할 금액 입력: ");
    int withdrawMoney = sc.nextInt();

    if (this.money < withdrawMoney) {
      System.out.println("출금할 금액은 잔액보다 클 수 없습니다");
      return;
    }

    this.money -= withdrawMoney;
    System.out.println(withdrawMoney + "원을 출금했습니다 남은 잔액은 " + this.money + "원입니다");
  }
}
