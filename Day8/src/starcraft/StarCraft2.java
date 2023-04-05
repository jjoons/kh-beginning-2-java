package starcraft;

// 빈 인터페이스 (Marker Interface)
//   상속 관계가 아닌 클래스들을 그룹화 시켜줄 수 있다.
interface Repairable {}

interface Medical {}

public class StarCraft2 {}

class Doctor extends Unit implements Medical { // 사람만 고치는 의사
  public Doctor(int MAX_HP) {
    super(MAX_HP);
  }

  public void heal(Unit u) {
    if (!(u instanceof Medical)) {
      System.out.println("나는 사람만 고치는 의사다! 로봇은 못 고친다");
      return;
    }

//    Unit u = (Medical) m;

    while (u.hp < u.MAX_HP) {
      System.out.println(u.hp++);

      try {
        // 프로그램을 지연시키는 함수
        //   sleep(ms) 1초: 1000ms, 0.5초: 500ms
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // throw new RuntimeException(e);

      }
    }

    System.out.println("치료 완료");
    // System.out.println("사람만 고친다");
  }

  @Override
  public void attack() {}

  @Override
  public void move() {}
}

class SCV extends Unit implements Repairable {
  public SCV(int MAX_HP) {
    super(MAX_HP);
  }

  @Override
  public void attack() {}

  @Override
  public void move() {}

  // 기계만 고쳐야 한다
  // 자식 클래스가 탱크 안에는 Unit과 Repairable이 들어있다.
  // 자식 입장에서는 타입 변환
  public void repair(Repairable r) {
    Unit u = (Unit) r;

    while (u.hp < u.MAX_HP) {
      System.out.println(u.hp++);

      try {
        // 프로그램을 지연시키는 함수
        //   sleep(ms) 1초: 1000ms, 0.5초: 500ms
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // throw new RuntimeException(e);

      }
    }

    System.out.println("수리 완료");
  }
}
