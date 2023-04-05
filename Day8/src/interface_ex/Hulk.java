package interface_ex;

public class Hulk implements Hero {
  private int hp = Hero.MAX_HP;

  @Override
  public void attack() {
    System.out.println("눈에 보이는 건 다 던짐");
  }

  @Override
  public void heal(int potion) {
    if (hp > Hero.MAX_HP) { // 고정한 체력보다 많이 차면 고정값으로 다시 저장
      hp = Hero.MAX_HP;
    } else hp += potion;

    System.out.println("헐크가 체력을 " + potion + "만큼 회복했습니다");
  }

  public void jump() {
    System.out.println("헐크가 엄청 높이 점프합니다");
  }
}
