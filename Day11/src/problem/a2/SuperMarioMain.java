package problem.a2;

class Mario extends SuperMarioBaseInfo {
  public Mario(String name, int hp, int level, String attackName, int damage, double attackDelay) {
    super();
    this.name = "마리오";
    this.hp = 300;
    this.level = 10;
    this.attackName = "펀치 공격";
    this.damage = 35;
    this.attackDelay = 1.0;
  }
}


class Marige extends SuperMarioBaseInfo {
  public Marige(String name, int hp, int level, String attackName, int damage, double attackDelay) {
    super();
    this.name = "마리지";
    this.hp = 300;
    this.level = 10;
    this.attackName = "폭탄 공격";
    this.damage = 30;
    this.attackDelay = 0.5;
  }
}


class PeachPrincess extends SuperMarioBaseInfo {
  public PeachPrincess(String name, int hp, int level, String attackName, int damage,
      double attackDelay) {
    super();
    this.name = "피치공주";
    this.hp = 300;
    this.level = 10;
    this.attackName = "물건 던지기";
    this.damage = 30;
    this.attackDelay = 1;
  }
}


class Kino extends SuperMarioBaseInfo {
  public Kino(String name, int hp, int level, String attackName, int damage, double attackDelay) {
    super();
    this.name = "버섯돌이";
    this.hp = 300;
    this.level = 10;
    this.attackName = "버섯 던지기";
    this.damage = 35;
    this.attackDelay = 1.5;
  }
}


class Kupa extends SuperMarioBaseInfo {
  public Kupa(String name, int hp, int level, String attackName, int damage, double attackDelay) {
    super();
    this.name = "쿠파";
    this.hp = 1000;
    this.level = 30;
    this.attackName = "공격";
    this.damage = 35;
    this.attackDelay = 1.5;
  }

  public int getHp() {
    return this.hp;
  }
}


public class SuperMarioMain {
  public static void main(String[] args) {
    // 마리오 클래스, 마리지 클래스, 피치공주, 버섯돌이
    // 이름, 목숨, 기본 레벨 10

    // 마리오: 300, 펀치 공격 (35씩 감소) 1초에 한번씩
    // 마리지: 300, 폭탄 공격 (30씩 감소) 0.5초에 한번씩
    // 피치공주: 300, 물건 던지기 (30씩 감소) 1초에 한번씩
    // 버섯돌이: 300, 버섯 던지기 (35씩 감소) 1.5초에 한번씩

    // 쿠파의 목숨은 인스턴스들이 접근할 수 있도록 공유
    // 불기둥 공격, 공격 시간 랜덤, 대미지 30 
    // 이름, 목숨 1000, 기본 레벨 30

    // 마리오가 쿠파를 공격하면 965
    // 
  }
}
