
class Parent {
  int money; // 상속 금액
  private int amount; // 비상금

  public Parent() {
    this.money = 1_000_000_000;
    this.amount = 10_000_000;
  }

  //
  public int getMoney(String s) {
    if (s.equals("허락")) {
      this.amount = 1_000_000;
      return 10_000_000;
    } else {
      System.out.println("미안하다 내 여생을 즐겨야 된다!");
      return 0;
    }
  }

  public void setMoney(int amount) {
    this.amount += amount;
  }
}

class Children extends Parent {

}

public class Main {
  public static void main(String[] args) {
    // private (비공개)
    // - 상속을 한 자식 클래스여도 접근 불가능

    // public (공개)

    Parent p1 = new Parent();
    System.out.println(p1.money);

    Children c1 = new Children();
    System.out.println(c1.money);

    Parent p2 = c1;

    c1.getMoney("돈 빌려주세요!");
  }
}
