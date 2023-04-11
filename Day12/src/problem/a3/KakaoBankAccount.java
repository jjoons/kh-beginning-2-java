package problem.a3;

import java.util.Scanner;

public class KakaoBankAccount {
  private String customerName;
  private String accountNumber;
  private int accountPw;
  private int money;
  private Scanner sc = new Scanner(System.in);
  private static int currentCustomerNumber = 1000;
  private int customerNumber = ++currentCustomerNumber;

  public KakaoBankAccount(String customerName, String accountNumber, int accountPw, int money) {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.accountPw = accountPw;
    this.money = money;
  }

  public int deposit(int money) {
    this.money += money;

    System.out.println(money + "원을 입금했습니다");

    return this.money;
  }

  public int withdraw(int money) throws KakaoBankException {
    if (this.money < money) {
      throw new KakaoBankException("출금할 금액은 현재 잔액보다 클 수 없습니다");
    }

    this.money -= money;

    System.out.println(money + "원을 출금했습니다");

    return this.money;
  }

  public boolean checkPw() throws KakaoBankException {
    System.out.println("비밀번호 입력: ");
    int inputPw = sc.nextInt();
    boolean isMatch = inputPw != this.accountPw;

    if (isMatch) {
      throw new KakaoBankException("비밀번호가 다릅니다");
    }

    return isMatch;
  }

  public int getMoney() {
    return this.money;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public int getCustomerNumber() {
    return this.customerNumber;
  }

  @Override
  public String toString() {
    return String.format("""
        -- 정보 --
        ID: %d
        이름: %s
        계좌번호: %s
        잔액: %d
        """, this.customerNumber, this.customerName, this.accountNumber, this.money);
  }
}
