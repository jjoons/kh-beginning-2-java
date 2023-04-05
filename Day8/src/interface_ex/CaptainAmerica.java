package interface_ex;

public class CaptainAmerica implements Hero {
  private int hp = Hero.MAX_HP;

  @Override
  public void attack() {
    System.out.println("방패를 던진다.");
  }

  @Override
  public void heal(int potion) {
    if (hp > Hero.MAX_HP) { // 고정한 체력보다 많이 차면 고정값으로 다시 저장
      hp = Hero.MAX_HP;
    } else hp += potion;

    System.out.println("캡틴 아메리카가 체력을 " + potion + "만큼 회복했습니다");
  }

  public void muster() {
    System.out.println("어벤져스 멤버들을 소집합니다");
  }
}
