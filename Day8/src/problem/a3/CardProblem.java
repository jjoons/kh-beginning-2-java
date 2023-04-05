package problem.a3;

import interface_ex.Card;

// 삼성카드
//   - 놀이동산 5회 무료 입장 가능
class SamsungCard extends Card implements Pack {
  @Override
  public void pay() {
    System.out.println("삼성카드로 결제");
  }

  @Override
  public void save() {
    System.out.println("삼성카드 포인트 적립");
  }

  @Override
  public void pack() {
    System.out.println("놀이동산 무료 입장");
  }
}

// 롯데카드
//   - 쇼핑, 주유, 영화
class LotteCard extends Card implements Shopping, Gas, Movie {
  @Override
  public void pay() {
    System.out.println("롯데카드로 결제");
  }

  @Override
  public void save() {
    System.out.println("롯데카드 포인트 적립");
  }

  @Override
  public void shop() {
    System.out.println("롯데카드 쇼핑 할인");
  }

  @Override
  public void gas() {
    System.out.println("롯데카드 주유 할인");
  }

  @Override
  public void movie() {
    System.out.println("롯데카드 영화 할인");
  }
}

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

public class CardProblem {
  public static void main(String[] args) {
    SamsungCard sc = new SamsungCard();


    LotteCard lc = new LotteCard();
  }
}
