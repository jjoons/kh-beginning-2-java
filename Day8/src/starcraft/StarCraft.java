package starcraft;

public class StarCraft {
  // 3개의 그룹(종족)
  //   저그, 테란, 프로토스

  // 탱크, 수송선, 마린
  public Tank t = new Tank(1000);
  public Marine m = new Marine(100);
  public Dropship g = new Dropship(2000);

  public void show() {
    System.out.println("탱크: " + t.hp);
    System.out.println("군인: " + m.hp);
    System.out.println("수송선" + g.hp);
  }
}

// 인터페이스
class Zerg extends StarCraft {}

class Terran extends StarCraft {}

class Protoss extends StarCraft {}

class Building {}

abstract class Unit {
  // 공격성을 가진 아이들은 모두 유닛
  final int MAX_HP;
  int hp;
  int x;
  int y;

  public Unit(int MAX_HP) {
    this.hp = this.MAX_HP = MAX_HP;
  }

  abstract public void attack(); // 공격

  abstract public void move(); // 이동
}

class Dropship extends Unit implements Repairable {
  public Dropship(int MAX_HP) {
    super(MAX_HP);
  }

  @Override
  public void attack() {}

  @Override
  public void move() {}
}

class Tank extends Unit implements Repairable {
  public Tank(int MAX_HP) {
    super(MAX_HP);
  }

  @Override
  public void attack() {}

  @Override
  public void move() {}
}

class Marine extends Unit implements Medical {
  public Marine(int MAX_HP) {
    super(MAX_HP);
  }

  @Override
  public void attack() {}

  @Override
  public void move() {}
}
