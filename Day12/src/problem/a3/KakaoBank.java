package problem.a3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KakaoBank {
  ArrayList<KakaoBankAccount> accounts = new ArrayList<>();

  Scanner sc = new Scanner(System.in);
  private int remainCount = 5;

  public void remain() throws KakaoBankException {
    this.remainCount--;
    System.out.println("남은 횟수는 " + this.remainCount + "번입니다");

    if (remainCount <= 0) {
      throw new KakaoBankException("남은 횟수가 없습니다. 사용 방법을 확인하신 후 다시 시도해 주시기 바랍니다");
    }
  }

  public void insert() throws KakaoBankException {
    System.out.println("고객님의 이름 입력: ");
    String name = sc.next();

    if (name.isBlank()) {
      String errorMsg = "고객님의 이름을 제대로 입력해 주시기 바랍니다";

      throw new KakaoBankException(errorMsg);
    }

    System.out.println("비밀번호 입력: ");
    int password;

    try {
      password = sc.nextInt();
    } catch (InputMismatchException e) {
      throw new KakaoBankException("비밀번호를 올바르게 입력해주세요", e);
    }

    if (password < 1000 || password > 9999) {
      throw new KakaoBankException("비밀번호는 4자리로 입력해야 합니다");
    }

    System.out.println("입금할 금액 입력: ");
    int money;
    try {
      money = sc.nextInt();
    } catch (Exception e) {
      throw new KakaoBankException("입금 금액은 숫자만 입력할 수 있습니다");
    }

    String accountNumber = this.makeAccountNumber();
    KakaoBankAccount newAccount = new KakaoBankAccount(name, accountNumber, password, money);
    accounts.add(newAccount);

    System.out.println(newAccount);

    System.out.println("계좌가 정상적으로 개설되었습니다");
  }

  private String makeAccountNumber() {
    String newAccountNumber = "";

    Random r = new Random();
    int[] s = new int[12];

    for (int i = 1; i <= s.length; i++) {
      newAccountNumber += r.nextInt(8) + 1;
      if (i % 4 == 0 && i != s.length)
        newAccountNumber += "-";
    }

    return newAccountNumber;
  }

  public String findWithAccountNumber() throws KakaoBankException {
    System.out.println("계좌번호 입력: ");
    String inputValue = sc.next();
    String result = "";
    KakaoBankAccount resultAcc = null;

    for (KakaoBankAccount kakaoBankAccount : accounts) {
      String accNum = kakaoBankAccount.getAccountNumber();

      if (accNum.equals(inputValue)) {
        result = accNum;
        resultAcc = kakaoBankAccount;
        break;
      }
    }

    if (result.isBlank()) {
      throw new KakaoBankException("계좌번호를 찾을 수 없습니다.");
    }

    System.out.println(resultAcc);

    return result;
  }
}
