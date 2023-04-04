package problem.a3;

public class CoffeeHomeSolution { // 커피가게
  // 주문서 (여러개의 객체를 관리하는 배열)
  Drink1[] drinks = new Drink1[3];

  public static void main(String[] args) {
    // 서로 다른 객체 생성
    Juice1 j = new Juice1();
    Coffee1 c = new Coffee1();
    Beer1 b = new Beer1();
    Tea1 t = new Tea1();

    // 부모 클래스 타입의 배열 생성
    // 이렇게 해도 되고~
    // Drink[] drinks = { j, c, t };

    CoffeeHomeSolution home = new CoffeeHomeSolution();
    home.drinks[0] = j;
    home.drinks[1] = c;
    home.drinks[2] = t;

    // 모든 음료를 주문!
    for (Drink1 d : home.drinks) {
      d.ordered();
    }
  }
}

class Drink1 {
  String name;
  double price;

  public void ordered() {
    System.out.println("주문되었습니다.");
  }
}

class Juice1 extends Drink1 {
  public void ordered() {
    System.out.println(name + "주문되었습니다.");
  }
}

class Coffee1 extends Drink1 {
  public void ordered() {
    System.out.println(name + "주문되었습니다.");
  }
}

class Beer1 extends Drink1 {
  public void ordered() {
    System.out.println("제일좋앙!!!나이쑤~테라!주문되었습니다.");
  }
}

class Tea1 extends Drink1 {
  public void ordered() {
    System.out.println(name + "주문되었습니다.");
  }
}
