package problem.a2;

public class CheckCard extends Account {
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
