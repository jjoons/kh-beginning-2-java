package problem.a4;

import java.util.ArrayList;

interface Flyable {
  void fly();
}

class FlyBird implements Flyable {
  @Override
  public void fly() {
    System.out.println("<새>가 날개를 퍼턱이며 날아갑니다!");
  }
}

class Helicopter implements Flyable {
  @Override
  public void fly() {
    System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!");
  }
}

class Rocket implements Flyable {
  @Override
  public void fly() {
    System.out.println("<로켓>이 제트 엔진을 분출하며 날아갑니다!");
  }
}

public class FlyableMain {
  public static void main(String[] args) {
    ArrayList<Flyable> flyableList = new ArrayList<>();

    flyableList.add(new FlyBird());
    flyableList.add(new Helicopter());
    flyableList.add(new Rocket());

    flyableList.forEach(a -> a.fly());
    flyableList.forEach(Flyable::fly);
  }

  public void main1() {
    new FlyBird().fly();
    new Helicopter().fly();
    new Rocket().fly();
  }
}
