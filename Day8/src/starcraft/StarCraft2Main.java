package starcraft;

public class StarCraft2Main {
  public static void main(String[] args) {
    Tank t = new Tank(1000);
    Marine m = new Marine(100);
    Dropship g = new Dropship(2000);

    // 전쟁을 하다 보니 체력이 많이 감소
    t.hp = 10;
    g.hp = 100;
    m.hp = 5;

    // 치료해 줄 사람이나 기계
    Doctor d = new Doctor(100); // 사람만 고친다
    SCV s = new SCV(500); // 기계만 고친다

    d.heal(t);
    d.heal(m);

//    s.repair(t); // 탱크는 기계
//    s.repair(g); // 수송선도 기계

  }
}
