package inheritance_currency;

public class Currency {
  // 수량 amount
  // 표기법 (원, 유로, 엔)

  double amount;
  String notation;

  public Currency(double amount, String notation) {
    this.amount = amount;
    this.notation = notation;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + ": " + amount + notation;
  }
}


class KRW extends Currency {
  public KRW(double amount, String notation) {
    super(amount, notation);
  }

  @Override
  public String toString() {
    // 객체 정보를 문자열로 반환
    // String 클래스 내부 format() 함수 이용
    return String.format("KRW: %.2f %s", amount, notation);
  }
}


class EUR extends Currency {
  public EUR(double amount, String notation) {
    super(amount, notation);
  }
}


class JPY extends Currency {
  public JPY(double amount, String notation) {
    super(amount, notation);
  }
}
