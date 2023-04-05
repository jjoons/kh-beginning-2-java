package interface_ex;

abstract public class Card {
  private String cardNumber; // 카드 번호
  String cardName; // 카드명
  private String cardPw; // 카드 비밀번호
  private int cvc; // CVC

  abstract public void pay();

  abstract public void save();

  // 값 수정: setter, 값 확인: getter

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardPw() {
    return cardPw;
  }

  public void setCardPw(String cardPw) {
    this.cardPw = cardPw;
  }

  public int getCvc() {
    return cvc;
  }

  public void setCvc(int cvc) {
    this.cvc = cvc;
  }
}

// 쇼핑, 주유, 적립, 영화 할인, 놀이동산 할인
interface Shopping {
  void shop();

}

interface Gas {
  void gas();
}

interface Movie {
  void movie();
}

interface Pack {
  void pack();
}

// 쇼핑, 주유
class HyundaiCard extends Card implements Shopping, Gas {
  @Override
  public void pay() {System.out.println("현대카드 결제");}

  @Override
  public void save() {System.out.println("현대카드 적립");}

  @Override
  public void shop() {System.out.println("현대카드로 주유 시 10% 할인");}

  @Override
  public void gas() {System.out.println("현대카드로 쇼핑 시 5% 추가 할인 및 적립");}
}

// 삼성카드
//   - 놀이동산 5회 무료 입장 가능

// 롯데카드
//   - 쇼핑, 주유, 영화,
